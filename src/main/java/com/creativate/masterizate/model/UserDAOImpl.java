package com.creativate.masterizate.model;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
 



import com.creativate.masterizate.model.objects.User;
import com.creativate.masterizate.util.CustomHibernateDaoSupport;

public class UserDAOImpl implements UserDAO {
	
    
    //Current Session - no need to close (REVISAR)
    private SessionFactory sessionFactory;

    @Autowired
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Autowired
    public UserDAOImpl() {
        this.sessionFactory = null;
    }
    
    private Session currentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    
   
	public void save(User usuario){
		getSessionFactory().getCurrentSession().save(usuario);
	}
	
	public void update(User usuario){
		getSessionFactory().getCurrentSession().update(usuario);
	}
	
	public void delete(User usuario){
		getSessionFactory().getCurrentSession().delete(usuario);
	}

	public List<User> getAllUsers(){
		
		return null;
	}
	
	public User findById(Integer idUser){
		
		String sql="SELECT node_id sessionFactory node_role WHERE role_id=?";
	      SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery(sql);
	      query.setLong(0,idUser);
	      query.addScalar("id_user" );
	      List list=query.list();
		
		return (User)list.get(0);
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}