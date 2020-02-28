package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Aname;
import com.example.tracking.repository.AnameRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnameService {

    @Autowired
    private AnameRepository anameRepository;
    
    public List<Aname> getAnames() {

        return anameRepository.findAll();
    }

    public void save(Aname name){
      anameRepository.save(name);
    }

    public Optional<Aname> findById(int id){
      return anameRepository.findById(id);
    }

    // find by keyword
    public List<Aname> findByKeyword(String keyword){
      return anameRepository.findByKeyword(keyword);
    }
    
}