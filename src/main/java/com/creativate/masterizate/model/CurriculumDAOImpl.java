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

import com.creativate.masterizate.model.objects.Curriculum;
import com.creativate.masterizate.model.objects.User;

public class CurriculumDAOImpl implements CurriculumDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
    public CurriculumDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public CurriculumDAOImpl() {
        this.sessionFactory = null;
    }
    
    private Session currentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Transactional
	public void save(Curriculum usuario){
		
		if (sessionFactory.getCurrentSession() == null){
			System.out.println("Esto es null, cohone!");	
		
		}
		sessionFactory.getCurrentSession().save(usuario);
	}
	
    @Transactional
	public void update(Curriculum cv){
		sessionFactory.getCurrentSession().update(cv);
	}
	
	public void delete(Curriculum cv){
		sessionFactory.getCurrentSession().delete(cv);
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

	@Override
	public void save(User p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User findByIdClient(String idClient) {
		// TODO Auto-generated method stub
		return null;
	}

	
}