package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Secao {
    private int codigo;
    private Sala sala;
    private LocalDateTime dataHora;
    private Filme filme;
    private ArrayList<Integer> poltronasOucupadas;

    public Secao(Sala sala, LocalDateTime dataHora, Filme filme, ArrayList<Integer> poltronasOucupadas, int codigo) {
        this.sala = sala;
        this.dataHora = dataHora;
        this.filme = filme;
        this.poltronasOucupadas = poltronasOucupadas;
        this.codigo = codigo;
    }
    
    public Secao(Sala sala, LocalDateTime dataHora, Filme filme, int codigo) {
        this.sala = sala;
        this.dataHora = dataHora;
        this.filme = filme;
        this.codigo = codigo;
    }

    public Secao() {
       poltronasOucupadas = new ArrayList<Integer>(Arrays.asList(1,5,11,8,13, 313));
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

    public ArrayList<Integer> getPoltronasOucupadas() {
        return poltronasOucupadas;
    }

    public void setPoltronasOucupadas(ArrayList<Integer> poltronasOucupadas) {
        this.poltronasOucupadas = poltronasOucupadas;
    }
}
