package Cine.Infra.Interfaces;

import Cine.Domain.Entities.Cinema;
import Cine.Domain.Entities.Filme;
import Cine.Domain.Entities.Ingresso;
import Cine.Domain.Entities.Sala;
import Cine.Domain.Entities.Sessao;
import Cine.Domain.Entities.Cliente;

public interface IUnitOfWork {

    IRepository<Cinema> CinemaRepository();

    IRepository<Filme> FilmeRepository();

    IRepository<Ingresso> IngressoRepository();

    IRepository<Sessao> SessaoRepository();

    IRepository<Sala> SalaRepository();

    IRepository<Cliente> ClienteRepository();

    void Commit();
}