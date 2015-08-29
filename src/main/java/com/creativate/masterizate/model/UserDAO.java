package com.creativate.masterizate.model;

import com.creativate.masterizate.model.objects.User;


public interface UserDAO {
 
    public void save(User p);
     
    public void update(User p);
     
    public void delete(User p);
}