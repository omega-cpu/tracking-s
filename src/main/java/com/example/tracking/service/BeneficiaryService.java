package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Beneficiary;
import com.example.tracking.repository.BeneficiaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeneficiaryService {

    @Autowired
    private BeneficiaryRepository beneficiaryRepository;
    
    public List<Beneficiary> getBeneficiaries(){

        return beneficiaryRepository.findAll();
    }

    public void save(Beneficiary beneficiary){
      beneficiaryRepository.save(beneficiary);
    }

    public Optional<Beneficiary> findById(int id){
      return beneficiaryRepository.findById(id);
    }
    // find by keyword
    public List<Beneficiary> findByKeyword(String keyword){
      return beneficiaryRepository.findByKeyword(keyword);
    }
    
}