package controller.DAO;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Funcionario;

public class FuncionarioDAO {

    private Connection conn = null;

    public FuncionarioDAO() throws SQLException {
        conn = Conexao.getConexao();
    }

    public void incluir(Funcionario func) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO funcionario(cpf, nome, telefone, ctps, matricula) values (?, ?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);

        ps.setString(1, func.getCpf());
        ps.setString(2, func.getNome());
        ps.setString(3, func.getTelefone());
        ps.setString(4, func.getCtps());
        ps.setString(5, func.getMatricula());

        ps.execute();
        ps.close();
    }

    public void excluir(Funcionario func) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM funcionario where codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, func.getCodigo());

        ps.execute();
        ps.close();
    }

    public void alteracao(Funcionario func) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE funcionario SET cpf = ?, nome = ?, telefone = ?, ctps = ?, matricula = ? WHERE codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setString(1, func.getCpf());
        ps.setString(2, func.getNome());
        ps.setString(3, func.getTelefone());
        ps.setString(4, func.getCtps());
        ps.setString(5, func.getMatricula());
        ps.setInt(6, func.getCodigo());

        ps.execute();
        ps.close();
    }

    public int qtdRegistro() throws SQLException {
        int count = 0;

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "Select count(*) from funcionario";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        rs.next();
        count = rs.getInt("count");

        rs.close();
        ps.close();

        return count;
    }

    public ArrayList<Funcionario> relatorio() throws SQLException {
        ArrayList<Funcionario> listFunc = new ArrayList<>();

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT * FROM funcionario";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Funcionario employe = new Funcionario(rs.getString("ctps"),
                    rs.getString("matricula"),
                    rs.getString("cpf"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getInt("codigo"));

            listFunc.add(employe);
        }

        rs.close();
        ps.close();

        return listFunc;
    }

}
