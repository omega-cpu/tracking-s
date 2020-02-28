package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Address;
import com.example.tracking.repository.AddressRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;
    
    public List<Address> getAddresses(){

        return addressRepository.findAll();
    }

    public void save(Address address){
      addressRepository.save(address);
    }

    public Optional<Address> findById(int id){
      return addressRepository.findById(id);
    }
    
}