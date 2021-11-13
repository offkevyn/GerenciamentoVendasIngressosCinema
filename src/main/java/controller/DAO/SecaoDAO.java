package controller.DAO;

import controller.Conexao;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import static java.util.Collections.list;
import java.util.Date;
import model.Filme;
import model.Sala;
import model.Secao;

public class SecaoDAO {

    private Connection conn = null;

    public SecaoDAO() throws SQLException {
        conn = Conexao.getConexao();
    }

    public void incluir(Secao secao) throws SQLException {
        String sql;
        PreparedStatement ps = null;
        Array array = conn.createArrayOf("INT", secao.getPoltronasOucupadas().toArray());

        sql = "INSERT INTO secao(sala_cod, filme_cod, data_hora, poltronas_oucupadas) values (?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, secao.getSala().getCodigo());
        ps.setInt(2, secao.getFilme().getCodigo());
        ps.setObject(3, secao.getDataHora());
        ps.setArray(4, array);

        ps.execute();
        ps.close();
    }

    public void excluir(Secao secao) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM secao where codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, secao.getCodigo());

        ps.execute();
        ps.close();

    }

    public void alteracao(Secao secao) throws SQLException {
        String sql;
        PreparedStatement ps = null;
        Array array = conn.createArrayOf("INT", secao.getPoltronasOucupadas().toArray());
        
        sql = "UPDATE secao SET sala_cod = ?, filme_cod = ?, data_hora = ?, poltronas_oucupadas = ? WHERE codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, secao.getSala().getCodigo());
        ps.setInt(2, secao.getFilme().getCodigo());
        ps.setObject(3, secao.getDataHora());
        ps.setArray(4, array);
        ps.setInt(5, secao.getCodigo());

        ps.execute();
        ps.close();
    }

    public int qtdRegistro() throws SQLException {
        int count = 0;

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "Select count(*) from secao";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        rs.next();
        count = rs.getInt("count");

        rs.close();
        ps.close();

        return count;
    }

    public ArrayList<Secao> relatorio() throws SQLException {
        ArrayList<Secao> listSecao = new ArrayList<>();
        LocalDateTime dataHora = LocalDateTime.now();
        ArrayList<Integer> poltronasOucupadas = new ArrayList<>();
        Date data = new Date();
        Date hora = new Date();

        String sql, sqlFilme, sqlSala;
        PreparedStatement ps = null, psFilme = null, psSala = null;
        ResultSet rs = null, rsFilme = null, rsSala = null;

        sql = "SELECT * FROM secao";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            sqlFilme = "SELECT * FROM filme where codigo = " + rs.getInt("filme_cod");
            psFilme = conn.prepareStatement(sqlFilme);
            rsFilme = psFilme.executeQuery();
            rsFilme.next();
            Filme movie = new Filme(rsFilme.getString("titulo"),
                    rsFilme.getString("sinopse"),
                    rsFilme.getInt("duracaoMinut"),
                    rsFilme.getInt("codigo"));

            sqlSala = "SELECT * FROM sala where codigo = " + rs.getInt("sala_cod");
            psSala = conn.prepareStatement(sqlSala);
            rsSala = psSala.executeQuery();
            rsSala.next();
            Sala room = new Sala(rsSala.getBoolean("vip"),
                    rsSala.getInt("qtd_poltronas"),
                    rsSala.getInt("numero"),
                    rsSala.getInt("codigo"));

            data = rs.getDate("data_hora");
            hora = rs.getTime("data_hora");

            dataHora = converterToDateTime(data, hora);
            
            poltronasOucupadas = null;
            Array array = rs.getArray("poltronas_oucupadas");
            if(array != null)
            {
                Integer[] zips = ((Integer[]) array.getArray());
                poltronasOucupadas = new ArrayList<Integer>(Arrays.asList(zips));
            }
            

            Secao session = new Secao(room,
                    dataHora,
                    movie,
                    poltronasOucupadas,
                    rs.getInt("codigo"));
            

            listSecao.add(session);
        }

        rs.close();
        ps.close();
        rsFilme.close();
        psFilme.close();
        rsSala.close();
        psSala.close();

        return listSecao;
    }

    public Secao SecaoPeloCodico(int codigo) throws SQLException {
        LocalDateTime dataHora = LocalDateTime.now();
        Date data = new Date();
        Date hora = new Date();
        ArrayList<Integer> poltronasOucupadas = new ArrayList<>();

        String sql, sqlFilme, sqlSala;
        PreparedStatement ps = null, psFilme = null, psSala = null;
        ResultSet rs = null, rsFilme = null, rsSala = null;

        sql = "SELECT * FROM secao where codigo = " + codigo;

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();

        sqlFilme = "SELECT * FROM filme where codigo = " + rs.getInt("filme_cod");
        psFilme = conn.prepareStatement(sqlFilme);
        rsFilme = psFilme.executeQuery();
        rsFilme.next();
        Filme movie = new Filme(rsFilme.getString("titulo"),
                rsFilme.getString("sinopse"),
                rsFilme.getInt("duracaoMinut"),
                rsFilme.getInt("codigo"));

        sqlSala = "SELECT * FROM sala where codigo = " + rs.getInt("sala_cod");
        psSala = conn.prepareStatement(sqlSala);
        rsSala = psSala.executeQuery();
        rsSala.next();
        Sala room = new Sala(rsSala.getBoolean("vip"),
                rsSala.getInt("qtd_poltronas"),
                rsSala.getInt("numero"),
                rsSala.getInt("codigo"));

        data = rs.getDate("data_hora");
        hora = rs.getTime("data_hora");

        dataHora = converterToDateTime(data, hora);
        
        poltronasOucupadas = null;
            Array array = rs.getArray("poltronas_oucupadas");
            if(array != null)
            {
                Integer[] zips = ((Integer[]) array.getArray());
                poltronasOucupadas = new ArrayList<Integer>(Arrays.asList(zips));
            }

        Secao session = new Secao(room,
                dataHora,
                movie,
                poltronasOucupadas,
                rs.getInt("codigo"));

        rs.close();
        ps.close();
        rsFilme.close();
        psFilme.close();
        rsSala.close();
        psSala.close();

        return session;
    }

    private LocalDateTime converterToDateTime(Date data, Date h) {
        Calendar calDate = Calendar.getInstance();
        calDate.setTime(data);

        Calendar calHora = Calendar.getInstance();
        calHora.setTime(h);

        int dia = calDate.get(Calendar.DAY_OF_MONTH),
                mes = calDate.get(Calendar.MONTH),
                ano = calDate.get(Calendar.YEAR),
                hora = calHora.get(Calendar.HOUR_OF_DAY),
                min = calHora.get(Calendar.MINUTE);

        return LocalDateTime.of(ano, mes + 1, dia, hora, min);

    }
    
    public void atualizaPoltronas(Secao secao, int numPoltrona, boolean adicionar) throws SQLException {
        String sql;
        PreparedStatement ps = null;
        
        if(adicionar)
            secao.getPoltronasOucupadas().add(numPoltrona);
        else
            secao.getPoltronasOucupadas().remove(numPoltrona);
        
        Array array = conn.createArrayOf("INT", secao.getPoltronasOucupadas().toArray());
        
        sql = "UPDATE secao SET poltronas_oucupadas = ? WHERE codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setArray(1, array);
        ps.setInt(2, secao.getCodigo());

        ps.execute();
        ps.close();
    }
}
