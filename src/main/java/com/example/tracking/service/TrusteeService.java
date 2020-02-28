package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Trustee;
import com.example.tracking.repository.TrusteeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrusteeService {

    @Autowired
    private TrusteeRepository trusteeRepository;
    
    public List<Trustee> getTrustees(){

        return trusteeRepository.findAll();
    }

    public void save(Trustee trustee){
      trusteeRepository.save(trustee);
    }

    public Optional<Trustee> findById(int id){
      return trusteeRepository.findById(id);
    }
    // find by keyword
    public List<Trustee> findByKeyword(String keyword){
      return trusteeRepository.findByKeyword(keyword);
    }
}