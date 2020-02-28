package com.example.tracking.service;

import java.util.List;
import java.util.Optional;


import com.example.tracking.models.Refund;
import com.example.tracking.repository.RefundRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RefundService {

    @Autowired
    private RefundRepository refundRepository;
    
    public List<Refund> getRefunds(){

        return refundRepository.findAll();
    }

    public void save(Refund refund){
      refundRepository.save(refund);
    }

    public Optional<Refund> findById(int id){
      return refundRepository.findById(id);
    }
    // find by keyword
    public List<Refund> findByKeyword(String keyword){
      return refundRepository.findByKeyword(keyword);
    }
}