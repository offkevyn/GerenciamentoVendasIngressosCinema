package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexao {
    private static Connection conn = null;
    
    public static Connection getConexao() throws SQLException
    {
        if(conn == null || conn.isClosed())
            conn = CriarConexao();
        
        return conn;
    }
    
    private static Connection CriarConexao()
    {
        String url;
        try
        {
            Class.forName("org.postgresql.Driver");

            Properties props = new Properties();

            props.put("user", "postgres");
            props.put("password", "123");
            props.put("charset", "UTF-8");

            url = "jdbc:postgresql://localhost:5432/GerenciamentoVendasIngressosCinema";

            return DriverManager.getConnection(url, props);
        }
        /** Retorna um erro caso nao encontre o driver, ou alguma informacao sobre o mesmo
         * esteja errada */
        catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o driver, ERRO: " + cnfe.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            cnfe.printStackTrace(); 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro-Criando Conexão, ERRO: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return null;
    }
}
