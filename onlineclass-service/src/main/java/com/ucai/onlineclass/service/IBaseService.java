package com.ucai.onlineclass.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/**
 * @author:jaimecai
 * @date:17-11-19 下午6:30
 * @description:
 */
public interface IBaseService<T> {
    void delete(T entity);

    void update(T entity);

    void insert(T entity);

    T get(Serializable id);

    T load(Serializable id);
    
    List<T> find(String hql, Object[] params);
    List<?> findAll();
}

