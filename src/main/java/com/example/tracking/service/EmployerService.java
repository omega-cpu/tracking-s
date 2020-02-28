package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Employer;
import com.example.tracking.repository.EmployerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerService {

    @Autowired
    private EmployerRepository employerRepository;
    
    public List<Employer> getEmployers(){

        return employerRepository.findAll();
    }

    public void save(Employer employer){
      employerRepository.save(employer);
    }

    public Optional<Employer> findById(int id){
      return employerRepository.findById(id);
    }
    // find by keyword
    public List<Employer> findByKeyword(String keyword){
      return employerRepository.findByKeyword(keyword);
    }
}