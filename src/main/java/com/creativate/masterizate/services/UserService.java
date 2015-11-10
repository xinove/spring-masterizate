package com.creativate.masterizate.services;

import com.creativate.masterizate.model.objects.User;

import java.util.List;
 
public interface UserService {
    public void addUser(User user);
    public List<User> getAllUsers();
    public User getUser(String username);
    public void deleteUser(Integer userId);
}