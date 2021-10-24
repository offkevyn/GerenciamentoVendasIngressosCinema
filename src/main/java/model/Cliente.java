package model;

public class Cliente extends Pessoa{
    private boolean vip;

    public Cliente(boolean vip, String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
        this.vip = vip;
    }

    public Cliente() {
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
