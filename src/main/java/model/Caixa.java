package model;

public class Caixa {
    private int codigo;
    private int numero;
    private Funcionario funcionario;

    public Caixa(int numero, Funcionario funcionario, int codigo) {
        this.numero = numero;
        this.funcionario = funcionario;
        this.codigo = codigo;
    }

    public Caixa() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}