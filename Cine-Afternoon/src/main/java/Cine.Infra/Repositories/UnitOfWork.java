package Cine.Infra.Repositories;

import Cine.Domain.Entities.Cinema;
import Cine.Domain.Entities.Cliente;
import Cine.Domain.Entities.Filme;
import Cine.Domain.Entities.Ingresso;
import Cine.Domain.Entities.Sala;
import Cine.Domain.Entities.Sessao;
import Cine.Infra.Context.DbContext;
import Cine.Infra.Interfaces.IRepository;
import Cine.Infra.Interfaces.IUnitOfWork;

import java.util.Objects;

public class UnitOfWork implements IUnitOfWork {

    private DbContext context = null;

    private Repository<Cliente> clienteRepository = null;

    private Repository<Cinema> cinemaRepository = null;

    private Repository<Filme> filmeRepository = null;

    private Repository<Ingresso> ingressoRepository = null;

    private Repository<Sessao> sessaoRepository = null;

    private Repository<Sala> salaRepository = null;

    public UnitOfWork() {
        this.context = new DbContext();
    }

    @Override
    public IRepository<Cinema> CinemaRepository() {
        if (Objects.isNull(cinemaRepository)) {
            cinemaRepository = new Repository<Cinema>(context);
        }
        return cinemaRepository;
    }

    @Override
    public IRepository<Filme> FilmeRepository() {
        if (Objects.isNull(filmeRepository)) {
            filmeRepository = new Repository<Filme>(context);
        }
        return filmeRepository;
    }

    @Override
    public IRepository<Ingresso> IngressoRepository() {
        return null;
    }

    @Override
    public IRepository<Sessao> SessaoRepository() {
        return null;
    }

    @Override
    public IRepository<Sala> SalaRepository() {
        return null;
    }

    @Override
    public IRepository<Cliente> ClienteRepository() {
        return null;
    }

    @Override
    public void Commit() {

    }
}
