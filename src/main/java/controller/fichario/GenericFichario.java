package controller.fichario;

import controller.DAO.FilmeDAO;
import controller.DAO.SalaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Filme;
import model.Sala;

public class GenericFichario<E> {

    private Class<E> classeEntidade;

    private SalaDAO salaDao;
    private FilmeDAO filmeDao;

    public GenericFichario(Class<E> classeEntidade) throws SQLException {
        this.classeEntidade = classeEntidade;

        salaDao = new SalaDAO();
        filmeDao = new FilmeDAO();
    }

    public void incluir(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.incluir((Sala) entidade);
        }
        else if (classeEntidade.equals(Filme.class)) {
            filmeDao.incluir((Filme) entidade);
        }
    }

    public void remove(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.excluir((Sala) entidade);
        }
        else if (classeEntidade.equals(Filme.class)) {
            filmeDao.excluir((Filme) entidade);
        }
    }

    public void alteracao(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.alteracao((Sala) entidade);
        }
        else if (classeEntidade.equals(Filme.class)) {
            filmeDao.alteracao((Filme) entidade);
        }
    }

    public ArrayList<E> relatorio() throws SQLException {
        ArrayList<E> listEntidades = null;

        if (classeEntidade.equals(Sala.class)) {
            listEntidades = (ArrayList<E>) salaDao.relatorio();
        }
        else if (classeEntidade.equals(Filme.class)) {
            listEntidades = (ArrayList<E>) filmeDao.relatorio();
        }

        return listEntidades;
    }

    public int qtdEntidade() throws SQLException {
        int cont = 0;
        if (classeEntidade.equals(Sala.class)) {
            cont = salaDao.qtdRegistro();
        }
        else if (classeEntidade.equals(Filme.class)) {
            cont = filmeDao.qtdRegistro();
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
