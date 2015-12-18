package com.creativate.masterizate.model;

import java.util.List;

import org.hibernate.SessionFactory;

import com.creativate.masterizate.model.objects.User;


public interface CurriculumDAO {
 
    public void save(User p);
     
    public void update(User p);
     
    public void delete(User p);
    
    public User findByIdClient(String idClient);

	public SessionFactory getSessionFactory();
	
	public void setSessionFactory(SessionFactory sessionFactory);
}