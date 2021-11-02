package model;

import java.time.LocalDate;

public class Ingresso {
    private int codigo;
    private Secao secao;
    private float preco;
    private Caixa caixa;
    private int acrescimo;
    private int poltrona;
    private Cliente cliente;

    public Ingresso(Secao secao, float preco, Caixa caixa, int acrescimo, int poltrona, Cliente cliente, int codigo) {
        this.secao = secao;
        this.preco = preco;
        this.caixa = caixa;
        this.acrescimo = acrescimo;
        this.poltrona = poltrona;
        this.cliente = cliente;
        this.codigo = codigo;
    }

    public Ingresso() {
        acrescimo = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Secao getSecao() {
        return secao;
    }

    public void setSecao(Secao secao) {
        this.secao = secao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public int getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(int acrescimo) {
        this.acrescimo = acrescimo;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
