package com.example.pizza.dao;

import java.util.List;

public interface IDao<T> {
    boolean create(T object);
    boolean update(T object);
    boolean delete(T object);
    List<T> findAll();
    T findById(int id);
}