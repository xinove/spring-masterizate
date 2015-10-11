package com.creativate.masterizate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.creativate.masterizate.model.UserDAO;
import com.creativate.masterizate.model.objects.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDAO userDAO;

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
    
	@Override
    @Transactional
    public void deleteUser(Integer userId){
    	User us = userDAO.findById(userId);
    	userDAO.delete(us);
    }

    @Transactional
	public UserDAO getUserDAO() {
		return userDAO;
	}

    @Transactional
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
