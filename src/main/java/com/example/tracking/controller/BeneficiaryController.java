package com.example.tracking.controller;


import java.util.Optional;


import com.example.tracking.models.Beneficiary;

import com.example.tracking.service.BeneficiaryService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BeneficiaryController {
    
    @Autowired
    private BeneficiaryService beneficiaryService;

    @GetMapping("/beneficiaries")
    public String getBeneficiary(Model model, String keyword){

       
        if(keyword != null){
            model.addAttribute("beneficiaries", beneficiaryService.findByKeyword(keyword));
        } 
        else{
         model.addAttribute("beneficiaries", beneficiaryService.getBeneficiaries());
        }
        return "beneficiary";
    }

    @PostMapping("/beneficiaries/addNew")
    public String addNew(Beneficiary beneficiary){
        beneficiaryService.save(beneficiary);
        return "redirect:/beneficiaries";

    }

    @RequestMapping("/beneficairies/findById")
    @ResponseBody
    public Optional<Beneficiary> findById(int id){
      return   beneficiaryService.findById(id);
    }
    
    @RequestMapping(value="/beneficiaries/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Beneficiary beneficiary){
        beneficiaryService.save(beneficiary);
        return "redirect:/beneficiaries";

    }
    
}