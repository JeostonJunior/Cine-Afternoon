package Cine.Domain.Entities;

import java.time.LocalDateTime;

public class Sessao {
    private int Id;
    private Filme Filme;
    private Sala Sala;
    private LocalDateTime Horario;

    public Sessao(int id, Filme filme, Sala sala, LocalDateTime horario) {
        Id = id;
        Filme = filme;
        Sala = sala;
        Horario = horario;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Filme getFilme() {
        return Filme;
    }

    public void setFilme(Filme filme) {
        Filme = filme;
    }

    public Sala getSala() {
        return Sala;
    }

    public void setSala(Sala sala) {
        Sala = sala;
    }

    public LocalDateTime getHorario() {
        return Horario;
    }

    public void setHorario(LocalDateTime horario) {
        Horario = horario;
    }
}