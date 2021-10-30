package model;

public class Cliente extends Pessoa{
    private boolean vip;

    public Cliente(String cpf, String nome, String telefone, boolean vip, int codigo) {
        super(cpf, nome, telefone, codigo);
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
