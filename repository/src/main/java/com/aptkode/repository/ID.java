package com.aptkode.repository;

public interface ID<T, K> {
    K getId();

    T getEntity();
}
