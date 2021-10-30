package model;

class Pessoa {
    private int codigo;
    private String cpf;
    private String nome;
    private String telefone;

    public Pessoa(String cpf, String nome, String telefone, int codigo) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.codigo = codigo;
    }

    public Pessoa() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
