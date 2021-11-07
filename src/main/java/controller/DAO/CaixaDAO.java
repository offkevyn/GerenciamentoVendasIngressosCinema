package controller.DAO;

import controller.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Caixa;
import model.Funcionario;

public class CaixaDAO {

    private Connection conn = null;

    public CaixaDAO() throws SQLException {
        conn = Conexao.getConexao();
    }

    public void incluir(Caixa caixa) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "INSERT INTO caixa(numero, funcionario_cod) values (?, ?)";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, caixa.getNumero());
        ps.setInt(2, caixa.getFuncionario().getCodigo());

        ps.execute();
        ps.close();
    }

    public void excluir(Caixa caixa) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM caixa where codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, caixa.getCodigo());

        ps.execute();
        ps.close();

    }

    public void alteracao(Caixa caixa) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE caixa SET numero = ?, funcionario_cod = ? WHERE codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, caixa.getNumero());
        ps.setInt(2, caixa.getFuncionario().getCodigo());
        ps.setInt(3, caixa.getCodigo());

        ps.execute();
        ps.close();
    }

    public int qtdRegistro() throws SQLException {
        int count = 0;

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "Select count(*) from caixa";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        rs.next();
        count = rs.getInt("count");

        rs.close();
        ps.close();

        return count;
    }

    public ArrayList<Caixa> relatorio() throws SQLException {
        ArrayList<Caixa> listCaixa = new ArrayList<>();

        String sql, sqlFunc;
        PreparedStatement ps = null, psFunc = null;
        ResultSet rs = null, rsFunc = null;

        sql = "SELECT * FROM caixa";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
            sqlFunc = "SELECT * FROM funcionario where codigo = " + rs.getInt("funcionario_cod");
            psFunc = conn.prepareStatement(sqlFunc);
            rsFunc = psFunc.executeQuery();
            rsFunc.next();
            Funcionario employe = new Funcionario(rsFunc.getString("ctps"),
                    rsFunc.getString("matricula"),
                    rsFunc.getString("cpf"),
                    rsFunc.getString("nome"),
                    rsFunc.getString("telefone"),
                    rsFunc.getInt("codigo"));

            Caixa cashier = new Caixa(rs.getInt("numero"),
                    employe,
                    rs.getInt("codigo"));

            listCaixa.add(cashier);
        }

        rs.close();
        ps.close();
        rsFunc.close();
        psFunc.close();

        return listCaixa;
    }

    public Caixa CaixaPeloCodico(int codigo) throws SQLException {
        String sql, sqlFunc;
        PreparedStatement ps = null, psFunc = null;
        ResultSet rs = null, rsFunc = null;

        sql = "SELECT * FROM caixa where codigo = " + codigo;

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();

        sqlFunc = "SELECT * FROM funcionario where codigo = " + rs.getInt("funcionario_cod");
        psFunc = conn.prepareStatement(sqlFunc);
        rsFunc = psFunc.executeQuery();
        rsFunc.next();
        Funcionario employe = new Funcionario(rsFunc.getString("ctps"),
                rsFunc.getString("matricula"),
                rsFunc.getString("cpf"),
                rsFunc.getString("nome"),
                rsFunc.getString("telefone"),
                rsFunc.getInt("codigo"));

        Caixa cashier = new Caixa(rs.getInt("numero"),
                employe,
                rs.getInt("codigo"));

        rs.close();
        ps.close();
        rsFunc.close();
        psFunc.close();

        return cashier;
    }

}
