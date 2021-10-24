package controller.fichario;

import controller.DAO.SalaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Sala;

public class GenericFichario<E> {

    private Class<E> classeEntidade;

    private SalaDAO salaDao;

    public GenericFichario(Class<E> classeEntidade) throws SQLException {
        this.classeEntidade = classeEntidade;

        salaDao = new SalaDAO();
    }

    public void incluir(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.incluir((Sala) entidade);
        }
    }

    public void remove(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.excluir((Sala) entidade);
        }
    }

    public void alteracao(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.alteracao((Sala) entidade);
        }
    }

    public ArrayList<E> relatorio() throws SQLException {
        ArrayList<E> listEntidades = null;

        if (classeEntidade.equals(Sala.class)) {
            listEntidades = (ArrayList<E>) salaDao.relatorio();
        }

        return listEntidades;
    }

    public int qtdEntidade() throws SQLException {
        int cont = 0;
        if (classeEntidade.equals(Sala.class)) {
            cont = salaDao.qtdRegistro();
        }

        return cont;
    }

    public Class<E> getClasseEntidade() {
        return classeEntidade;
    }

    public void setClasseEntidade(Class<E> classeEntidade) {
        this.classeEntidade = classeEntidade;
    }
}
