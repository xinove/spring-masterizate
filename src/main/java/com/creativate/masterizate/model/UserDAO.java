package com.creativate.masterizate.model;

import java.util.List;

import org.hibernate.SessionFactory;

import com.creativate.masterizate.model.objects.User;


public interface UserDAO {
 
    public void save(User p);
     
    public void update(User p);
     
    public void delete(User p);
    
    public List<User> getAllUsers();
    
    public User findByUsername(String name);

	public User findById(Integer idUser);
	
	public SessionFactory getSessionFactory();
	
	public void setSessionFactory(SessionFactory sessionFactory);
}