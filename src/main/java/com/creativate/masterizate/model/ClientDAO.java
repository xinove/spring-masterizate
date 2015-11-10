package com.creativate.masterizate.model;

import java.util.List;

import org.hibernate.SessionFactory;

import com.creativate.masterizate.model.objects.Client;

public interface ClientDAO {
	 public void save(Client p);
     
    public void update(Client p);
     
    public void delete(Client p);
    
    public List<Client> getAll();
    
    //public Client findByUsername(String name);

	public Client findById(Integer idClient);
	
	public SessionFactory getSessionFactory();
	
	public void setSessionFactory(SessionFactory sessionFactory);
}