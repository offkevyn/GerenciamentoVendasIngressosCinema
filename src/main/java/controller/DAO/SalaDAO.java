package controller.DAO;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Sala;

public class SalaDAO {

    private Connection conn = null;

    public SalaDAO() throws SQLException {
        conn = Conexao.getConexao();
    }

    public void incluir(Sala sala) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO sala(numero, vip, qtd_poltronas) values (?, ?, ?)";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, sala.getNumero());
        ps.setBoolean(2, sala.isVip());
        ps.setInt(3, sala.getQtdPoltronas());

        ps.execute();
        ps.close();
    }
    
    public void excluir(Sala sala) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM sala where codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, sala.getCodigo());

        ps.execute();
        ps.close();
        
    }
    
    public void alteracao(Sala sala) throws SQLException
    {
            String sql;
            PreparedStatement ps = null;

            sql = "UPDATE sala SET numero = ?, vip = ?, qtd_poltronas = ? WHERE codigo = ?";
            
                ps = conn.prepareStatement(sql);
                
                ps.setInt(1, sala.getNumero());
                ps.setBoolean(2, sala.isVip());
                ps.setInt(3, sala.getQtdPoltronas());
                ps.setInt(4, sala.getCodigo());

                ps.execute();
                ps.close();
    }

    public int qtdRegistro() throws SQLException {
        int count = 0;

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "Select count(*) from sala";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        rs.next();
        count = rs.getInt("count");

        rs.close();
        ps.close();

        return count;
    }

    public ArrayList<Sala> relatorio() throws SQLException {
        ArrayList<Sala> listSala = new ArrayList<>();

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT * FROM sala";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Sala room = new Sala(rs.getBoolean("vip"),
                    rs.getInt("qtd_poltronas"),
                    rs.getInt("numero"),
                    rs.getInt("codigo"));

            listSala.add(room);
        }

        rs.close();
        ps.close();

        return listSala;
    }
}
