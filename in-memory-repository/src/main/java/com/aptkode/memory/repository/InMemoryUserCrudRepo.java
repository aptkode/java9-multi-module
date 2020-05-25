package com.aptkode.memory.repository;

import com.aptkode.entity.User;
import com.aptkode.repository.CrudRepository;
import com.aptkode.repository.ID;

import java.util.*;

public class InMemoryUserCrudRepo implements CrudRepository<User, String> {

    private final Map<String, User> data = new HashMap<>();

    @Override
    public Optional<User> findById(String id) {
        return Optional.of(data.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(data.values());
    }


    @Override
    public User save(ID<User, String> entity) {
        return data.put(entity.getId(), entity.getEntity());
    }
}
