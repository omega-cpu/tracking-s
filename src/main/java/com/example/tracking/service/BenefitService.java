package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Benefit;
import com.example.tracking.repository.BenefitRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BenefitService {

    @Autowired
    private BenefitRepository benefitRepository;
    
    public List<Benefit> getBenefits(){

        return benefitRepository.findAll();
    }

    public void save(Benefit benefit){
      benefitRepository.save(benefit);
    }

    public Optional<Benefit> findById(int id){
      return benefitRepository.findById(id);
    }
    // find by keyword
    public List<Benefit> findByKeyword(String keyword){
      return benefitRepository.findByKeyword(keyword);
    }
}