package com.aptkode.entity;

import com.aptkode.repository.ID;

import java.util.UUID;

public class User implements ID<User, String> {
    private final String id;
    private final String name;

    public User(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public User getEntity() {
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
