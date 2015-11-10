package com.creativate.masterizate.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.creativate.masterizate.model.objects.Client;
import com.creativate.masterizate.model.objects.User;
import com.creativate.masterizate.util.CustomHibernateDaoSupport;

@Repository("clienteDao")
public class ClientDAOImpl implements ClientDAO {
	@Autowired
    private SessionFactory sessionFactory;
	
    public ClientDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public ClientDAOImpl() {
        this.sessionFactory = null;
    }
    
    private Session currentSession() {
        return this.sessionFactory.getCurrentSession();
    }
    @Transactional
	public void save(Client client){
		
		if (sessionFactory.getCurrentSession() == null){
			System.out.println("Esto es null, cohone!");	
		
		}
		sessionFactory.getCurrentSession().save(client);
	}
	
    @Transactional
	public void update(Client cliente){
		sessionFactory.getCurrentSession().update(cliente);
	}
	
	public void delete(Client cliente){
		sessionFactory.getCurrentSession().delete(cliente);
	}
	
    @Transactional
	public List<Client> getAll(){
		// create query
		Query query = sessionFactory.getCurrentSession().createQuery("FROM Clients");
		return (List<Client>)query.list();
	}
	
	public Client findById(Integer idClient){
		
		String sql="SELECT node_id sessionFactory node_role WHERE role_id=?";
	      SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery(sql);
	      query.setLong(0,idClient);
	      query.addScalar("id_user" );
	      List list=query.list();
		
		return (Client)list.get(0);
	}
	
	/*public User findByUsername(String username){
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("username", username));
        return (User) criteria.uniqueResult();
	}*/
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}