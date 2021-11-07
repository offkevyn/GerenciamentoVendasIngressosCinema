package controller.DAO;

import controller.Conexao;
import controller.fichario.CaixaFichario;
import controller.fichario.ClienteFichario;
import controller.fichario.SecaoFichario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Caixa;
import model.Cliente;
import model.Ingresso;
import model.Secao;

public class IngressoDAO {

    private Connection conn = null;

//    private SecaoFichario fixSecao;
//    private ClienteFichario fixCliente;
//    private CaixaFichario fixCaixaa;
    private SecaoDAO secaoDao;
    private ClienteDAO clienteDao;
    private CaixaDAO caixaaDao;

    public IngressoDAO() throws SQLException {
        conn = Conexao.getConexao();

//        fixSecao = new SecaoFichario();
//        fixCliente = new ClienteFichario();
//        fixCaixaa = new CaixaFichario();
        secaoDao = new SecaoDAO();
        clienteDao = new ClienteDAO();
        caixaaDao = new CaixaDAO();

    }

    public void incluir(Ingresso ingresso) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "insert into ingresso(secao_cod, caixa_cod, cliente_cod, preco, acresimo, poltrona) values (?, ?, ?, ?, ?, ?);";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, ingresso.getSecao().getCodigo());
        ps.setInt(2, ingresso.getCaixa().getCodigo());
        ps.setInt(3, ingresso.getCliente().getCodigo());
        ps.setFloat(4, ingresso.getPreco());
        ps.setInt(5, ingresso.getAcrescimo());
        ps.setInt(6, ingresso.getPoltrona());

        ps.execute();
        ps.close();
    }

    public void excluir(Ingresso ingresso) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "DELETE FROM ingresso where codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, ingresso.getCodigo());

        ps.execute();
        ps.close();

    }

    public void alteracao(Ingresso ingresso) throws SQLException {
        String sql;
        PreparedStatement ps = null;

        sql = "UPDATE ingresso SET secao_cod = ?, caixa_cod = ?, cliente_cod = ?, preco = ?, acresimo = ?, poltrona = ? WHERE codigo = ?";

        ps = conn.prepareStatement(sql);

        ps.setInt(1, ingresso.getSecao().getCodigo());
        ps.setInt(2, ingresso.getCaixa().getCodigo());
        ps.setInt(3, ingresso.getCliente().getCodigo());
        ps.setFloat(4, ingresso.getPreco());
        ps.setInt(5, ingresso.getAcrescimo());
        ps.setInt(6, ingresso.getPoltrona());
        ps.setInt(7, ingresso.getCodigo());

        ps.execute();
        ps.close();
    }

    public int qtdRegistro() throws SQLException {
        int count = 0;

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "Select count(*) from ingresso";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        rs.next();
        count = rs.getInt("count");

        rs.close();
        ps.close();

        return count;
    }

    public ArrayList<Ingresso> relatorio() throws SQLException {
        ArrayList<Ingresso> listIngresso = new ArrayList<>();

        String sql;
        PreparedStatement ps = null;
        ResultSet rs = null;

        sql = "SELECT * FROM ingresso";

        ps = conn.prepareStatement(sql);
        rs = ps.executeQuery();

        while (rs.next()) {
//            Secao secao = fixSecao.entidadePeloID(rs.getInt("secao_cod"));
//            Cliente cliente = fixCliente.entidadePeloID(rs.getInt("cliente_cod"));
//            Caixa caixaa = fixCaixaa.entidadePeloID(rs.getInt("caixa_cod"));
            Secao secao = secaoDao.SecaoPeloCodico(rs.getInt("secao_cod"));
            Cliente cliente = clienteDao.ClientePeloCodico(rs.getInt("cliente_cod"));
            Caixa caixaa = caixaaDao.CaixaPeloCodico(rs.getInt("caixa_cod"));

            Ingresso ticket = new Ingresso(secao,
                    rs.getFloat("preco"),
                    caixaa,
                    rs.getInt("acresimo"),
                    rs.getInt("poltrona"),
                    cliente,
                    rs.getInt("codigo"));

            listIngresso.add(ticket);
        }

        rs.close();
        ps.close();

        return listIngresso;
    }
}
