package com.creativate.masterizate.services;

import org.springframework.stereotype.Repository;
import com.creativate.masterizate.model.objects.User;
import com.creativate.masterizate.util.CustomHibernateDaoSupport;

import java.util.List;
 
public interface UserService {
    public void addUser(User user);
    public List<User> getAllUsers();
    public void deleteUser(Integer userId);
}