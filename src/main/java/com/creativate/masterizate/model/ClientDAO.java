package com.creativate.masterizate.model;

import com.creativate.masterizate.model.objects.Client;


public interface ClientDAO {
 
    public void save(Client p);
     
    public void update(Client p);
     
    public void delete(Client p);
}