package Cine.Domain.Entities;

import java.util.ArrayList;
import java.util.List;

public class Sala {
    private int Id;
    private int Numero;
    private int Capacidade;
    private boolean Is3D;
    private List<String> Equipamentos;
    private double PrecoIngresso;
    private List<Sessao> Sessao;

    public Sala(int id, int numero, int capacidade, boolean is3D, List<String> equipamentos, double precoIngresso, List<Sessao> sessao) {
        Id = id;
        Numero = numero;
        Capacidade = capacidade;
        Is3D = is3D;
        Equipamentos = new ArrayList<>(equipamentos);
        PrecoIngresso = precoIngresso;
        Sessao = new ArrayList<>(sessao);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }

    public boolean isIs3D() {
        return Is3D;
    }

    public void setIs3D(boolean is3D) {
        Is3D = is3D;
    }

    public List<String> getEquipamentos() {
        return Equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        Equipamentos.add(equipamentos);
    }

    public double getPrecoIngresso() {
        return PrecoIngresso;
    }

    public void setPrecoIngresso(double precoIngresso) {
        PrecoIngresso = precoIngresso;
    }

    public List<Sessao> getSessao() {
        return Sessao;
    }

    public void setSessao(Sessao sessao) {
        Sessao.add(sessao);
    }
}
