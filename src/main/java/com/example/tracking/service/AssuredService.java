package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Assured;
import com.example.tracking.repository.AssuredRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssuredService {

    @Autowired
    private AssuredRepository assuredRepository;
    
    public List<Assured> getAssures(){

        return assuredRepository.findAll();
    }

    public void save(Assured assured){
      assuredRepository.save(assured);
    }

    public Optional<Assured> findById(int id){
      return assuredRepository.findById(id);
    }

      // find by keyword
      public List<Assured> findByKeyword(String keyword){
        return assuredRepository.findByKeyword(keyword);
      }
    
}