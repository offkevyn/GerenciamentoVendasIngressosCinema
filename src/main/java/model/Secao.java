package model;

import java.time.LocalDateTime;

public class Secao {
    private int codigo;
    private Sala sala;
    private LocalDateTime dataHora;
    private Filme filme;
    private int poltronasOucupadas;

    public Secao(Sala sala, LocalDateTime dataHora, Filme filme, int poltronasOucupadas, int codigo) {
        this.sala = sala;
        this.dataHora = dataHora;
        this.filme = filme;
        this.poltronasOucupadas = poltronasOucupadas;
        this.codigo = codigo;
    }

    public Secao() {
        poltronasOucupadas = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
