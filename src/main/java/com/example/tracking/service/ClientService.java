package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Client;
import com.example.tracking.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;
    
    public List<Client> getClients(){

        return clientRepository.findAll();
    }

    public void save(Client client){
      clientRepository.save(client);
    }

    public Optional<Client> findById(int id){
      return clientRepository.findById(id);
    }
    // find by keyword
    public List<Client> findByKeyword(String keyword){
      return clientRepository.findByKeyword(keyword);
    }
}