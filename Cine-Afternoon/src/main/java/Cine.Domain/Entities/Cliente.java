package Cine.Domain.Entities;

public class Cliente {
    private int Id;
    private String Nome;
    private String Cpf;
    private boolean IsEstudante;

    public Cliente(int id, String nome, String cpf, boolean isEstudante) {
        Id = id;
        Nome = nome;
        Cpf = cpf;
        IsEstudante = isEstudante;
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

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public boolean isEstudante() {
        return IsEstudante;
    }

    public void setEstudante(boolean estudante) {
        IsEstudante = estudante;
    }
}