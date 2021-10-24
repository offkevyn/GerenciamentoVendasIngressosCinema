package model;

import java.time.LocalDateTime;

public class Secao {
    private Sala sala;
    private LocalDateTime dataHora;
    private Filme filme;
    private int poltronasOucupadas;

    public Secao(Sala sala, LocalDateTime dataHora, Filme filme, int poltronasOucupadas) {
        this.sala = sala;
        this.dataHora = dataHora;
        this.filme = filme;
        this.poltronasOucupadas = poltronasOucupadas;
    }

    public Secao() {
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public int getPoltronasOucupadas() {
        return poltronasOucupadas;
    }

    public void setPoltronasOucupadas(int poltronasOucupadas) {
        this.poltronasOucupadas = poltronasOucupadas;
    }
}
