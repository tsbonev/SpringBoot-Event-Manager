package com.tsbonev.Dao;

import java.util.Collection;

public interface BaseDao<T> {
    Collection<T> getAll();

    T getById(int id);

    void removeById(int id);

    void update(T item);

    void insert(T item);
}