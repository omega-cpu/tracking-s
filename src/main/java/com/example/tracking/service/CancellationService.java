package com.example.tracking.service;

import java.util.List;
import java.util.Optional;


import com.example.tracking.models.Cancellation;

import com.example.tracking.repository.CancellationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancellationService {

    @Autowired
    private CancellationRepository cancellationRepository;
    
    public List<Cancellation> getCancellations(){

        return cancellationRepository.findAll();
    }

    public void save(Cancellation cancellation){
      cancellationRepository.save(cancellation);
    }

    public Optional<Cancellation> findById(int id){
      return cancellationRepository.findById(id);
    }
    // find by keyword
    public List<Cancellation> findByKeyword(String keyword){
      return cancellationRepository.findByKeyword(keyword);
    }
    
}