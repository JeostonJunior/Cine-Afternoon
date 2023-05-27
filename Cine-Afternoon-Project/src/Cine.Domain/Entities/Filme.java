package Cine.Domain.Entities;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private int Id;
    private String Titulo;
    private String Diretor;
    private String AtorPrincipal;
    private double Duracao;
    private String Classificacao;
    private List<String> Categoria;

    public Filme(int id, String titulo, String diretor, String atorPrincipal, double duracao, String classificacao, List<String> categoria) {
        Id = id;
        Titulo = titulo;
        Diretor = diretor;
        AtorPrincipal = atorPrincipal;
        Duracao = duracao;
        Classificacao = classificacao;
        Categoria = new ArrayList<>(categoria);
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }

    public String getAtorPrincipal() {
        return AtorPrincipal;
    }

    public void setAtorPrincipal(String atorPrincipal) {
        AtorPrincipal = atorPrincipal;
    }

    public double getDuracao() {
        return Duracao;
    }

    public void setDuracao(int duracao) {
        Duracao = duracao;
    }

    public String getClassificacao() {
        return Classificacao;
    }

    public void setClassificacao(String classificacao) {
        Classificacao = classificacao;
    }

    public List<String> getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria.add(categoria);
    }
}