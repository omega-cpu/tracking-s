package com.example.tracking.controller;


import java.util.Optional;

import com.example.tracking.models.Bank;
import com.example.tracking.service.BankService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class BankController {
    
    @Autowired
    private BankService bankService;

    @GetMapping("/banks")
    public String getBank(Model model, String keyword){

  
        if(keyword != null){
            model.addAttribute("banks", bankService.findByKeyword(keyword));
        } 
        else{
         model.addAttribute("banks", bankService.getBanks());
        }
        return "bank";
    }

    @PostMapping("/banks/addNew")
    public String addNew(Bank bank){
        bankService.save(bank);
        return "redirect:/banks";

    }

    @RequestMapping("/banks/findById")
    @ResponseBody
    public Optional<Bank> findById(int id){
      return   bankService.findById(id);
    }
    
    @RequestMapping(value="/banks/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Bank bank){
        bankService.save(bank);
        return "redirect:/banks";

    }
    
}