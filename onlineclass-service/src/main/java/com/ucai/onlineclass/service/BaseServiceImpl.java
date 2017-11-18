package com.ucai.onlineclass.service;
import com.ucai.onlineclass.dao.IBaseDao;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BaseServiceImpl<T> implements IBaseService<T>{

    IBaseDao<T> baseDao;

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void delete(T entity) {
        baseDao.delete(entity);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void update(T entity) {
        baseDao.update(entity);
    }

    @Override
    @Transactional(propagation=Propagation.REQUIRED)
    public void insert(T entity) {
        baseDao.insert(entity);
    }

    @Override
    @Transactional(readOnly=true)
    public T get(Serializable id) {
        return baseDao.get(id);
    }

    @Override
    @Transactional(readOnly=true)
    public T load(Serializable id) {
        return baseDao.get(id);
    }
    
    @Override
    public List<T> find(String hql, Object[] params) {
        return (List<T>)baseDao.find(hql, params);
    }
    @Override
    public List<T> findAll(String hql) {
        return baseDao.queryAll(hql);
    }

    public void setBaseDao(IBaseDao<T> baseDao){
        this.baseDao=baseDao;
    }

	
}
