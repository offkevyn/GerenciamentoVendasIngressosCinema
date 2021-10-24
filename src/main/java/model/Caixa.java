package model;

public class Caixa {
    private int numero;
    private Funcionario funcionario;

    public Caixa(int numero, Funcionario funcionario) {
        this.numero = numero;
        this.funcionario = funcionario;
    }

    public Caixa() {
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