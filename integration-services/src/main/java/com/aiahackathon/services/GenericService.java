package com.aiahackathon.services;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;
import java.util.Optional;

public interface GenericService<T, ID extends Serializable> {

    public default Iterable<T> findAll() {
        return getRepository().findAll();
    }

    public default Optional<T> get(ID id) {
        return getRepository().findById(id);
    }

    public default T save(T entity) {
        return getRepository().save(entity);
    }

    public default void delete(ID id) throws Exception {
        if (getRepository().existsById(id)) {
            getRepository().deleteById(id);
        }
        else {
            throw new Exception("Entity doesn't exist: " + id);
        }
    }

    public default void update(T entity) throws Exception {
        if (getRepository().existsById(getId(entity))) {
            getRepository().save(entity);
        }
        else {
            throw new Exception("Cannot update entity because it doesn't exist in DB: " + entity);
        }
    }

    public ID getId(T entity);

    public CrudRepository<T, ID> getRepository();
}
