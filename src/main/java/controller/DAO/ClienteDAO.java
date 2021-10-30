
package controller.DAO;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Cliente;

public class ClienteDAO {
    private Connection conn = null;

    public ClienteDAO() throws SQLException {
        conn = Conexao.getConexao();
    }
    
    public void incluir(Cliente cliente) throws SQLException {
        String sql;
        PreparedStatement ps = null;
        sql = "INSERT INTO cliente(cpf, nome, telefone,  vip) values (?, ?, ?, ?)";

        ps = conn.prepareStatement(sql);

        ps.setString(1, cliente.getCpf());
        ps.setString(2, cliente.getNome());
        ps.setString(3, cliente.getTelefone());
        ps.setBoolean(4, cliente.isVip());

        ps.execute();
        ps.close();
    }
    
    public void excluir(Cliente cliente) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM cliente where codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, cliente.getCodigo());

        ps.execute();
        ps.close();
    }
    
    public void alteracao(Cliente cliente) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE cliente SET cpf = ?, nome = ?, telefone = ?, vip = ? WHERE codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setString(1, cliente.getCpf());
        ps.setString(2, cliente.getNome());
        ps.setString(3, cliente.getTelefone());
        ps.setBoolean(4, cliente.isVip());
        ps.setInt(5, cliente.getCodigo());

        ps.execute();
        ps.close();
    }
    
    public int qtdRegistro() throws SQLException {
        int count = 0;

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "Select count(*) from cliente";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        rs.next();
        count = rs.getInt("count");

        rs.close();
        ps.close();

        return count;
    }
    
    public ArrayList<Cliente> relatorio() throws SQLException {
        ArrayList<Cliente> listCliente = new ArrayList<>();

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT * FROM cliente";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            Cliente client = new Cliente(rs.getString("cpf"),
                    rs.getString("nome"),
                    rs.getString("telefone"),
                    rs.getBoolean("vip"),
                    rs.getInt("codigo"));

            listCliente.add(client);
        }

        rs.close();
        ps.close();

        return listCliente;
    }
}
