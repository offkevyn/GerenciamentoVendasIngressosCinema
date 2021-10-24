package logic;

import controller.fichario.SalaFichario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Sala;

public class SalaLogic {

    private SalaFichario fixSala;

    public SalaLogic() {
        try {
            fixSala = new SalaFichario();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro de conexão, ERRO: " + sqlex.getMessage(), "ERROR SALA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
    }

    public void incluir(Sala room) {
        try {
            fixSala.incluir(room);
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [INCLUIR], ERRO: " + sqlex.getMessage(), "ERROR SALA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
    }
    
    public void remove(Sala room) {

        try {
            fixSala.remove(room);
        } catch (SQLException sqlex)//Retorna um erro caso exista erro de query SQL
        {
            if (sqlex.getSQLState().equalsIgnoreCase("23503")) {
                JOptionPane.showMessageDialog(null, "Não pode ser excluido, pois tem dependente(s): " + sqlex.getMessage(), "ERROR SALA", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Erro na query [REMOVER], ERRO: " + sqlex.getMessage(), "ERROR SALA", JOptionPane.ERROR_MESSAGE);
            }
            sqlex.printStackTrace();
        }
    }
    
    public void alteracao(Sala room) {
        try {
            fixSala.alteracao(room);
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [ALTERAÇÃO], ERRO: " + sqlex.getMessage(), "ERROR SALA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
    }

    public int qtdSala() {
        int cont = 0;
        try {
            cont = fixSala.qtdEntidade();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [QTD SALA], ERRO: " + sqlex.getMessage(), "ERROR SALA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }
        return cont;
    }

    public ArrayList<Sala> relatorio() {
        ArrayList<Sala> listSala = null;

        try {
            listSala = fixSala.relatorio();
        } catch (SQLException sqlex) //Retorna um erro caso exista erro de query SQL
        {
            JOptionPane.showMessageDialog(null, "Erro na query [RELATÓRIO], ERRO: " + sqlex.getMessage(), "ERROR SALA", JOptionPane.ERROR_MESSAGE);
            sqlex.printStackTrace();
        }

        return listSala;
    }
}
