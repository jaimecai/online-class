package com.ucai.onlineclass.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public interface IBaseService<T> {
    void delete(T entity);

    void update(T entity);

    void insert(T entity);

    T get(Serializable id);

    T load(Serializable id);

    List<T> queryAll(String hql,HashMap<String , Object>params);
}
