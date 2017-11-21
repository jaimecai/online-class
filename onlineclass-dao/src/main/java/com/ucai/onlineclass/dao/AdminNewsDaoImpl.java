package com.ucai.onlineclass.dao;

import com.ucai.onlineclass.pojo.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.stereotype.Repository;

@Repository
public class AdminNewsDaoImpl extends BaseDaoImpl<News> implements IAdminNewsDao{

	@Override
	public List<News> newsLikefind(String hql, Object[] params) {
		List<News> data = this.getHibernateTemplate().execute(new HibernateCallback<List<News>>() {
            @Override
            public List<News> doInHibernate(Session session) throws HibernateException {
            	Criteria cr = session.createCriteria(News.class); 
                if (params != null) {
                   if(params[0]!=null){
                        
                   }
                }

                return cr.list();
            }
        });
        return data;
	}
}
