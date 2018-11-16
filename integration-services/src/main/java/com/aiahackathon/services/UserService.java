package com.aiahackathon.services;

import com.aiahackathon.entities.User;
import com.aiahackathon.jpa.UserRepository;
import org.springframework.data.repository.CrudRepository;

public class UserService implements GenericService<User, Long> {

    private final UserRepository repo;

    public  UserService (final UserRepository reposi) {
        this.repo = reposi;
    }

    @Override
    public Long getId(User entity) {
        return entity.getId();
    }

    @Override
    public User save(User entity) {
        return GenericService.super.save(entity);
    }

    @Override
    public CrudRepository<User, Long> getRepository() {
        return this.repo;
    }
}
