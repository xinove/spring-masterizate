package com.creativate.masterizate.model;

import org.springframework.stereotype.Repository;

import com.creativate.masterizate.model.objects.User;
import com.creativate.masterizate.util.CustomHibernateDaoSupport;

@Repository("userDao")
public class UserDAOImpl extends CustomHibernateDaoSupport implements UserDAO {
 
	public void save(User usuario){
		getHibernateTemplate().save(usuario);
	}
	
	public void update(User usuario){
		getHibernateTemplate().update(usuario);
	}
	
	public void delete(User usuario){
		getHibernateTemplate().delete(usuario);
	}

	
	/*public User findById(String stockCode){
		List list = getHibernateTemplate().find(
                     "from Stock where stockCode=?",stockCode
                );
		return (User)list.get(0);
	}*/
}