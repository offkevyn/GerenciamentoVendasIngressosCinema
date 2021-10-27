package controller.DAO;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Filme;
import model.Sala;

public class FilmeDAO {

    private Connection conn = null;

    public FilmeDAO() throws SQLException {
        conn = Conexao.getConexao();
    }

    public void incluir(Filme filme) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO filme(titulo, sinopse, duracaoMinut) values (?, ?, ?)";

        ps = conn.prepareStatement(sql);

        ps.setString(1, filme.getTitulo());
        ps.setString(2, filme.getSinopse());
        ps.setInt(3, filme.getDuracaoMinut());

        ps.execute();
        ps.close();
    }

    public void excluir(Filme filme) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM filme where codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, filme.getCodigo());

        ps.execute();
        ps.close();

    }

    public void alteracao(Filme filme) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE filme SET titulo = ?, sinopse = ?, duracaoMinut = ? WHERE codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setString(1, filme.getTitulo());
        ps.setString(2, filme.getSinopse());
        ps.setInt(3, filme.getDuracaoMinut());
        ps.setInt(4, filme.getCodigo());

        ps.execute();
        ps.close();
    }

    public int qtdRegistro() throws SQLException {
        int count = 0;

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "Select count(*) from filme";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        rs.next();
        count = rs.getInt("count");

        rs.close();
        ps.close();

        return count;
    }

    public ArrayList<Filme> relatorio() throws SQLException {
        ArrayList<Filme> listFilme = new ArrayList<>();

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT * FROM filme";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Filme movie = new Filme(rs.getString("titulo"),
                    rs.getString("sinopse"),
                    rs.getInt("duracaoMinut"),
                    rs.getInt("codigo"));

            listFilme.add(movie);
        }

        rs.close();
        ps.close();

        return listFilme;
    }
}
