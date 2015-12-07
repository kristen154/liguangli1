package com.hjy.ssh.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hjy.ssh.dao.BaseDao;

public class UserDao extends HibernateDaoSupport implements BaseDao  {

	private Session session;
	
	/*@Override
	public void saveObject(Object obj) throws HibernateException {
		// TODO Auto-generated method stub
		session.save(obj);
	}

	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return session;
	}

	@Override
	public void setSession(Session session) {
		// TODO Auto-generated method stub
		this.session=session;
	}*/

	 @Override  
	    public void saveObject(Object obj) throws HibernateException {  
	        getHibernateTemplate().save(obj);  
	    }  
	
}
