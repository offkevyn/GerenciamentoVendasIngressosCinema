package model;

class Funcionario extends Pessoa{
    private String ctps;
    private String matricula;

    public Funcionario(String ctps, String matricula, String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
        this.ctps = ctps;
        this.matricula = matricula;
    }

    public Funcionario() {
    }
    
    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
