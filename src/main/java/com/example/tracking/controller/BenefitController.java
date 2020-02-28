package com.example.tracking.controller;


import java.util.Optional;

import com.example.tracking.models.Benefit;

import com.example.tracking.service.BenefitService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BenefitController {
    
    @Autowired
    private BenefitService benefitService;

    @GetMapping("/benefits")
    public String getBenefit(Model model, String keyword){

        if(keyword != null){
            model.addAttribute("benefits", benefitService.findByKeyword(keyword));
        } 
        else{
            model.addAttribute("benefits", benefitService.getBenefits());
        }
       
        
    
        return "benefit";
    }

    @PostMapping("/benefits/addNew")
    public String addNew(Benefit benefit){
        benefitService.save(benefit);
        return "redirect:/benefits";

    }

    @RequestMapping("/benefits/findById")
    @ResponseBody
    public Optional<Benefit> findById(int id){
      return   benefitService.findById(id);
    }
    
    @RequestMapping(value="/benefits/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Benefit benefit){
        benefitService.save(benefit);
        return "redirect:/benefits";

    }
    
}