package controller.fichario;

import controller.DAO.SecaoDAO;
import controller.DAO.FilmeDAO;
import controller.DAO.SalaDAO;
import controller.DAO.CaixaDAO;
import controller.DAO.FuncionarioDAO;
import controller.DAO.ClienteDAO;
import controller.DAO.IngressoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Caixa;
import model.Cliente;
import model.Filme;
import model.Funcionario;
import model.Ingresso;
import model.Sala;
import model.Secao;

public class GenericFichario<E> {

    private Class<E> classeEntidade;

    private SalaDAO salaDao;
    private FilmeDAO filmeDao;
    private SecaoDAO secaoDao;
    private FuncionarioDAO funcionarioDao;
    private ClienteDAO clienteDao;
    private CaixaDAO caixaDao;
    private IngressoDAO ingressoDao;

    public GenericFichario(Class<E> classeEntidade) throws SQLException {
        this.classeEntidade = classeEntidade;

        salaDao = new SalaDAO();
        filmeDao = new FilmeDAO();
        secaoDao = new SecaoDAO();
        funcionarioDao = new FuncionarioDAO();
        clienteDao = new ClienteDAO();
        caixaDao = new CaixaDAO();
        ingressoDao = new IngressoDAO();
    }

    public void incluir(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.incluir((Sala) entidade);
        }
        else if (classeEntidade.equals(Filme.class)) {
            filmeDao.incluir((Filme) entidade);
        }
        else if (classeEntidade.equals(Secao.class)) {
            secaoDao.incluir((Secao) entidade);
        }
        else if (classeEntidade.equals(Funcionario.class)) {
            funcionarioDao.incluir((Funcionario) entidade);
        }
        else if (classeEntidade.equals(Cliente.class)) {
            clienteDao.incluir((Cliente) entidade);
        }   
        else if (classeEntidade.equals(Caixa.class)) {
            caixaDao.incluir((Caixa) entidade);
        }
        else if (classeEntidade.equals(Ingresso.class)) {
            ingressoDao.incluir((Ingresso) entidade);
        }
    }

    public void remove(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.excluir((Sala) entidade);
        }
        else if (classeEntidade.equals(Filme.class)) {
            filmeDao.excluir((Filme) entidade);
        }
        else if (classeEntidade.equals(Secao.class)) {
            secaoDao.excluir((Secao) entidade);
        }
        else if (classeEntidade.equals(Funcionario.class)) {
           funcionarioDao.excluir((Funcionario) entidade);
        }
        else if (classeEntidade.equals(Cliente.class)) {
           clienteDao.excluir((Cliente) entidade);
        }
        else if (classeEntidade.equals(Caixa.class)) {
            caixaDao.excluir((Caixa) entidade);
        }
    }

    public void alteracao(E entidade) throws SQLException {
        if (classeEntidade.equals(Sala.class)) {
            salaDao.alteracao((Sala) entidade);
        }
        else if (classeEntidade.equals(Filme.class)) {
            filmeDao.alteracao((Filme) entidade);
        }
        else if (classeEntidade.equals(Secao.class)) {
            secaoDao.alteracao((Secao) entidade);
        }
        else if (classeEntidade.equals(Funcionario.class)) {
           funcionarioDao.alteracao((Funcionario) entidade);
        }
        else if (classeEntidade.equals(Cliente.class)) {
           clienteDao.alteracao((Cliente) entidade);
        }
        else if (classeEntidade.equals(Caixa.class)) {
            caixaDao.alteracao((Caixa) entidade);
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
        else if (classeEntidade.equals(Secao.class)) {
            listEntidades = (ArrayList<E>) secaoDao.relatorio();
        }
        else if (classeEntidade.equals(Funcionario.class)) {
            listEntidades = (ArrayList<E>) funcionarioDao.relatorio();
        }
        else if (classeEntidade.equals(Cliente.class)) {
            listEntidades = (ArrayList<E>) clienteDao.relatorio();
        }
        else if (classeEntidade.equals(Caixa.class)) {
            listEntidades = (ArrayList<E>) caixaDao.relatorio();
        }
        else if (classeEntidade.equals(Ingresso.class)) {
            listEntidades = (ArrayList<E>) ingressoDao.relatorio();
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
        else if (classeEntidade.equals(Secao.class)) {
            cont = secaoDao.qtdRegistro();
        }
        else if (classeEntidade.equals(Funcionario.class)) {
            cont = funcionarioDao.qtdRegistro();
        }
        else if (classeEntidade.equals(Cliente.class)) {
            cont = clienteDao.qtdRegistro();
        }
        else if (classeEntidade.equals(Caixa.class)) {
            cont = caixaDao.qtdRegistro();
        }
        else if (classeEntidade.equals(Ingresso.class)) {
            cont = ingressoDao.qtdRegistro();
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
