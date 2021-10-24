package model;

public class Filme {
    private String titulo;
    private String sinopse;
    private int duracaoMinut;

    public Filme(String titulo, String sinopse, int duracaoMinut) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.duracaoMinut = duracaoMinut;
    }

    public Filme() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracaoMinut() {
        return duracaoMinut;
    }

    public void setDuracaoMinut(int duracaoMinut) {
        this.duracaoMinut = duracaoMinut;
    }
}
