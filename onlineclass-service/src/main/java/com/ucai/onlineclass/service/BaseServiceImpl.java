package com.ucai.onlineclass.service;


import com.ucai.onlineclass.dao.IBaseDao;

import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl<T> implements IBaseService<T>{

    IBaseDao<T> baseDao;

    @Override
    public void delete(T entity) {
        baseDao.delete(entity);
    }

    @Override
    public void update(T entity) {
        baseDao.update(entity);
    }

    @Override
    public void insert(T entity) {
        baseDao.insert(entity);
    }

    @Override
    public T get(Serializable id) {
        return baseDao.get(id);
    }

    @Override
    public T load(Serializable id) {
        return baseDao.get(id);
    }

    @Override
    public List<T> queryAll() {
        return baseDao.queryAll();
    }

    public void setBaseDao(IBaseDao<T> baseDao){
        this.baseDao=baseDao;
    }
}
