package Cine.Domain.Entities;

public class Ingresso {
    private int Id;
    private Cliente Cliente;
    private Sessao Sessao;
    private double Valor;

    public Ingresso(int id, Cliente cliente, Sessao sessao, double valor) {
        Id = id;
        Cliente = cliente;
        Sessao = sessao;
        Valor = valor;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public Sessao getSessao() {
        return Sessao;
    }

    public void setSessao(Sessao sessao) {
        Sessao = sessao;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }
}