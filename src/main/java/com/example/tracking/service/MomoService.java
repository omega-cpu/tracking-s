package com.example.tracking.service;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Momo;
import com.example.tracking.repository.MomoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MomoService {

    @Autowired
    private MomoRepository momoRepository;
    
    public List<Momo> getMomos(){

        return momoRepository.findAll();
    }

    public void save(Momo momo){
      momoRepository.save(momo);
    }

    public Optional<Momo> findById(int id){
      return momoRepository.findById(id);
    }
    // find by keyword
    public List<Momo> findByKeyword(String keyword){
      return momoRepository.findByKeyword(keyword);
    }
}