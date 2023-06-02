package Cine.Infra.Interfaces;

import java.util.List;
import java.util.function.Predicate;

public interface IRepository<T> {
    List<T> getAll(Predicate<T> predicate);

    T get(Predicate<T> predicate);

    void add(T entity);

    void update(T entity);

    void delete(T entity);
}
