package com.aptkode.repository;

public interface CrudRepository<T,ID> extends ReadRepository<T,ID>, CreateRepository<T,ID> {
}
