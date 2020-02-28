package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Bank;
import com.example.tracking.repository.BankRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Autowired
    private BankRepository bankRepository;
    
    public List<Bank> getBanks(){

        return bankRepository.findAll();
    }

    public void save(Bank bank){
      bankRepository.save(bank);
    }

    public Optional<Bank> findById(int id){
      return bankRepository.findById(id);
    }
    // find by keyword
    public List<Bank> findByKeyword(String keyword){
      return bankRepository.findByKeyword(keyword);
    }
}