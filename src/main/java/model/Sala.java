package model;

public class Sala {
    private int codigo;
    private boolean vip;   
    private int qtdPoltronas;
    private int numero;

    public Sala(boolean vip, int qtdPoltronas, int numero, int codigo) {
        this.vip = vip;
        this.qtdPoltronas = qtdPoltronas;
        this.numero = numero;
        this.codigo = codigo;
    }

    public Sala() {
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getQtdPoltronas() {
        return qtdPoltronas;
    }

    public void setQtdPoltronas(int qtdPoltronas) {
        this.qtdPoltronas = qtdPoltronas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
