package model;

import java.time.LocalDate;

public class Ingresso {
    private Secao secao;
    private float preco;
    private Caixa caixa;
    private int acrescimo;
    private LocalDate agendado;
    private int poltrona;
    private Cliente cliente;

    public Ingresso(Secao secao, float preco, Caixa caixa, int acrescimo, LocalDate agendado, int poltrona, Cliente cliente) {
        this.secao = secao;
        this.preco = preco;
        this.caixa = caixa;
        this.acrescimo = acrescimo;
        this.agendado = agendado;
        this.poltrona = poltrona;
        this.cliente = cliente;
    }

    public Ingresso() {
        acrescimo = 0;
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

    public LocalDate getAgendado() {
        return agendado;
    }

    public void setAgendado(LocalDate agendado) {
        this.agendado = agendado;
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
