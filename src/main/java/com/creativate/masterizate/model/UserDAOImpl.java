package com.creativate.masterizate.model;

import java.util.List;

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

	public List<User> getAllUsers(){
		
		return null;
	}
	
	public User findById(Integer idUser){
		List list = getHibernateTemplate().find(
                     "from users where id_user=?",idUser
                );
		return (User)list.get(0);
	}
}