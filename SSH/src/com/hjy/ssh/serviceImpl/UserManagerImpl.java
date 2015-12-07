package com.hjy.ssh.serviceImpl;

import org.hibernate.Session;

import com.hjy.ssh.beans.User;
import com.hjy.ssh.dao.BaseDao;
import com.hjy.ssh.daoImpl.HibernateSessionFactory;
import com.hjy.ssh.daoImpl.UserDao;
import com.hjy.ssh.forms.UserForm;
import com.hjy.ssh.service.UserManager;

import org.hibernate.HibernateException;   
import org.hibernate.Transaction;  
import org.springframework.beans.BeanUtils;
  


public class UserManagerImpl implements UserManager {

	 	private BaseDao baseDao;  
	  
	    /*private Session session;  */
	  
	    public BaseDao getBaseDao() {
			return baseDao;
		}

		public void setBaseDao(BaseDao baseDao) {
			this.baseDao = baseDao;
		}

		public UserManagerImpl() {  
	    	baseDao = new UserDao();  
	    }  
	  
	    @Override  
	    public void regUser(UserForm userForm) throws HibernateException {  
	        /*session = HibernateSessionFactory.getSession();  
	        dao.setSession(session);  
	        // 获取事务  
	        Transaction ts = session.beginTransaction();  
	        // 构造User对象  
	        User user = new User();  
	        user.setUsername(userForm.getUsername());  
	        user.setPassword(userForm.getPassword());  
	        user.setGender(userForm.getGender());  
	        // 保存User对象  
	        dao.saveObject(user);  
	        // 提交事务  
	        ts.commit();  
	        // 关闭Session  
	        HibernateSessionFactory.closeSession(session);  */
	    	
	    	 User user = new User();  
		     BeanUtils.copyProperties(userForm, user);  
		     baseDao.saveObject(user); 
	    }  
	  
	   
}
