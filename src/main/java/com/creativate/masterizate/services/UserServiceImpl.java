package com.creativate.masterizate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.creativate.masterizate.model.UserDAO;
import com.creativate.masterizate.model.objects.User;
import com.creativate.masterizate.util.CustomHibernateDaoSupport;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDAO userDAO;
    
	//@Autowired
	@Override
    @Transactional
    public void addUser(User user) {
    	userDAO.save(user);
    }
    
    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    
    public void deleteUser(Integer userId){
    	User us = userDAO.findById(userId);
    	userDAO.delete(us);
    }
}
