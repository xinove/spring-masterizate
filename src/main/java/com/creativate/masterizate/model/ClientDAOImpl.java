package com.creativate.masterizate.model;

import org.springframework.stereotype.Repository;

import com.creativate.masterizate.model.objects.Client;
import com.creativate.masterizate.util.CustomHibernateDaoSupport;

@Repository("clienteDao")
public class ClientDAOImpl extends CustomHibernateDaoSupport implements ClientDAO {
 
	public void save(Client cliente){
		getHibernateTemplate().save(cliente);
	}
	
	public void update(Client cliente){
		getHibernateTemplate().update(cliente);
	}
	
	public void delete(Client cliente){
		getHibernateTemplate().delete(cliente);
	}

	
	/*public User findById(String stockCode){
		List list = getHibernateTemplate().find(
                     "from Stock where stockCode=?",stockCode
                );
		return (User)list.get(0);
	}*/
}