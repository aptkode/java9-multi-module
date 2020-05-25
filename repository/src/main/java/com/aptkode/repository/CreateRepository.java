package com.aptkode.repository;

public interface CreateRepository<T,K> {
    T save(ID<T,K> entity);
}
