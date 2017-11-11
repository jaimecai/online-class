package com.ucai.onlineclass.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements IBaseDao<T> {
    private Class<T> entityClass;

    public BaseDaoImpl() {
        //给子类实现类用的
        Type genType = getClass().getGenericSuperclass();
        //BaseDaoImpl<T,A,..>
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClass = (Class) params[0];
    }

    @Autowired
    public void setParendtSessionFacrory(SessionFactory sessionFactory) {
        this.setSessionFactory(sessionFactory);
    }

    @Override
    public void delete(T entity) {
        this.getHibernateTemplate().delete(entity);
    }

    @Override
    public void update(T entity) {
        this.getHibernateTemplate().update(entity);
    }

    @Override
    public void insert(T entity) {
        this.getHibernateTemplate().save(entity);
    }

    @Override
    public T get(Serializable id) {
        return this.getHibernateTemplate().get(entityClass, id);
    }

    @Override
    public T load(Serializable id) {
        return this.getHibernateTemplate().load(entityClass, id);
    }

    @Override
    public List<T> find(String hql, Object[] params) {
        return (List<T>) this.getHibernateTemplate().find(hql, params);
    }

    @Override
    public List<T> queryAll(String hql,HashMap<String, Object>params) {
    	List<T> data = this.getHibernateTemplate().execute(new HibernateCallback<List<T>>() {
            @Override
            public List<T> doInHibernate(Session session) throws HibernateException {
                Query qr = session.createQuery(hql);
                qr.setProperties(params);
                return qr.list();
            }
        });
        return data;
    }

    @Override
    public List<T> queryPage(String hql, int pageNo, int pageSize, Object... params) {
        List<T> data = this.getHibernateTemplate().execute(new HibernateCallback<List<T>>() {
            @Override
            public List<T> doInHibernate(Session session) throws HibernateException {
                Query qr = session.createQuery(hql);
                if (params != null) {
                    for (int i = 0; i < params.length; i++)
                        qr.setParameter(i, params[i]);
                }
                qr.setFirstResult((pageNo - 1) * pageSize);
                qr.setMaxResults(pageSize);
                return qr.list();
            }
        });
        return data;
    }

    @Override
    public int updateObjects(String hql, Object[] conditions) {
        int count = this.getHibernateTemplate().execute(new HibernateCallback<Integer>() {
            @Override
            public Integer doInHibernate(Session session) throws HibernateException {
                try {
                    Query query = session.createQuery(hql);
                    for (int i = 0; i < conditions.length; i++)
                        query.setParameter(i, conditions[i]);
                    return query.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return 0;
            }
        });
        return count;
    }

}
