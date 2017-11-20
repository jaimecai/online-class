package com.ucai.onlineclass.dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T> {
    void delete(T entity);
    void update(T entity);
    void insert(T entity);

    T get(Serializable id);
    T load(Serializable id);

    List<T> find(String hql, Object... params);

    List<T> queryPage(String hql, int pageNo, int pageSize, Object... params);

    int updateObjects(final String hql, final Object[] conditions);

    List<T> queryAll(String hql);
    
}
