package com.hjy.ssh.daoImpl;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.HibernateException;  
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  


public class HibernateSessionFactory {

	/*private static SessionFactory factory;
	static{
		try{
			//读取hibernate.cfg.xml文件
			Configuration cfg=new Configuration().configure();
			//建立SessionFactory。
			//SessionFactory在Hibernate中实际起到了一个缓冲区的作用，
			//它缓冲了Hibernate自动生成的SQL语句和一些其它的映射数据，还缓冲了一些将来有可能重复利用的数据
			factory=cfg.buildSessionFactory();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static Session getSession(){
		return factory.openSession();
	}
	
	public static void closeSession(Session session){
		if(session != null){
			if(session.isOpen()){
				session.close();
			}
		
	}}*/
	
	/*public static SessionFactory getSessionFactory(){
		return factory;
	}*/
}
