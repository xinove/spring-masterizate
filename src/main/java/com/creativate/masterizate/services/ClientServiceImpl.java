package com.creativate.masterizate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.creativate.masterizate.model.ClientDAO;
import com.creativate.masterizate.model.objects.Client;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
    private ClientDAO clientDAO;

	@Override
    @Transactional
    public void add(Client client) {
		clientDAO.save(client);
    }
    
	@Override
    @Transactional
    public List<Client> getAll() {
        return clientDAO.getAll();
    }
    
	@Override
    @Transactional
    public void delete(Integer clientId){
    	Client us = clientDAO.findById(clientId);
    	clientDAO.delete(us);
    }

    @Transactional
	public ClientDAO getClientDAO() {
		return clientDAO;
	}

    @Transactional
	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}

	@Override
	public Client getClient(String username) {
		// TODO Auto-generated method stub
		return null;
	}
    
    /*@Transactional
    public User get(String username){
    	return clientDAO.findfindByUsername(username);
    }
*/
}
