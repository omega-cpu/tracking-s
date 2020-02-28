package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Claim;
import com.example.tracking.repository.ClaimRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;
    
    public List<Claim> getClaims(){

        return claimRepository.findAll();
    }

    public void save(Claim claim){
      claimRepository.save(claim);
    }

    public Optional<Claim> findById(int id){
      return claimRepository.findById(id);
    }
    // find by keyword
    public List<Claim> findByKeyword(String keyword){
      return claimRepository.findByKeyword(keyword);
    }
}