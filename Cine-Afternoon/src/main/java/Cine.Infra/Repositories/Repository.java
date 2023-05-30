package Cine.Infra.Repositories;

import Cine.Infra.Context.DbContext;
import Cine.Infra.Interfaces.IRepository;

import java.util.List;
import java.util.function.Predicate;

public class Repository<T> implements IRepository<T> {
    private DbContext context = null;
    private final Class<T> entityType;

    public Repository(DbContext context) {
        this.context = context;
        this.entityType = entityType;
    }

    @Override
    public List<T> getAll(Predicate<T> predicate) {
        throw new RuntimeException();
    }

    @Override
    public T get(Predicate<T> predicate) {
        throw new RuntimeException();
    }

    @Override
    public void add(T entity) {
        throw new RuntimeException();
    }

    @Override
    public void update(T entity) {
        throw new RuntimeException();
    }

    @Override
    public void delete(T entity) {
        throw new RuntimeException();
    }

    @Override
    public int count() {
        throw new RuntimeException();
    }
}
