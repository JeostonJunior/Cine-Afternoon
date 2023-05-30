package Cine.Domain.Entities;

import java.util.List;

public class Cinema {
    private int Id;
    private String Nome;
    private String Endereco;
    private List<Sala> Salas;

    public Cinema(int id, String nome, String endereco, List<Sala> salas) {
        Id = id;
        Nome = nome;
        Endereco = endereco;
        Salas = salas;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public List<Sala> getSalas() {
        return Salas;
    }

    public void setSalas(List<Sala> salas) {
        Salas = salas;
    }
}
