package com.creativate.masterizate.model;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.creativate.masterizate.model.objects.User;

public class UserDAOImpl implements UserDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
    public UserDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public UserDAOImpl() {
        this.sessionFactory = null;
    }
    
    private Session currentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Transactional
	public void save(User usuario){
		
		if (sessionFactory.getCurrentSession() == null){
			System.out.println("Esto es null, cohone!");	
		
		}
		sessionFactory.getCurrentSession().save(usuario);
	}
	
    @Transactional
	public void update(User usuario){
		sessionFactory.getCurrentSession().update(usuario);
	}
	
	public void delete(User usuario){
		sessionFactory.getCurrentSession().delete(usuario);
	}
	
    @Transactional
	public List<User> getAllUsers(){
		// create query
		Query query = sessionFactory.getCurrentSession().createQuery("FROM User");
		return (List<User>)query.list();
	}
	
	public User findById(Integer idUser){
		
		String sql="SELECT node_id sessionFactory node_role WHERE role_id=?";
	      SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery(sql);
	      query.setLong(0,idUser);
	      query.addScalar("id_user" );
	      List list=query.list();
		
		return (User)list.get(0);
	}
	
	public User findByUsername(String username){
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("username", username));
        return (User) criteria.uniqueResult();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}