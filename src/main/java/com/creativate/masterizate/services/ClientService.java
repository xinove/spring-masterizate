package com.creativate.masterizate.services;

import com.creativate.masterizate.model.objects.Client;

import java.util.List;
 
public interface ClientService {
    public void add(Client user);
    public List<Client> getAll();
    public Client getClient(String username);
    public void delete(Integer clientId);
}