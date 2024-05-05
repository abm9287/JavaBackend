package com.store.store.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService 
{
    @Autowired
    private ClientRepository clientRepository; 
    
    //Método insert
    public Client save(Client entity)
    {
        return clientRepository.save(entity);
    }

    //Método select
    public Client findById(long id)
    {
        return clientRepository.findById(id).orElse(null);
    }
}
