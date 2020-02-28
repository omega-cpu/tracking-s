package com.example.tracking.controller;


import java.util.Optional;

import com.example.tracking.models.Cancellation;
import com.example.tracking.service.CancellationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CancellationController {
    
    @Autowired
    private CancellationService cancellationService;

    @GetMapping("/cancellations")
    public String getCancellation(Model model, String keyword){

       
        if(keyword != null){
            model.addAttribute("cancellations", cancellationService.findByKeyword(keyword));
        } 
        else{
         model.addAttribute("cancellations", cancellationService.getCancellations());
        }
        return "cancellation";
    }

    @PostMapping("/cancellations/addNew")
    public String addNew(Cancellation cancellation){
        cancellationService.save(cancellation);
        return "redirect:/cancellations";

    }

    @RequestMapping("/cancellations/findById")
    @ResponseBody
    public Optional<Cancellation> findById(int id){
      return   cancellationService.findById(id);
    }
    
    @RequestMapping(value="/cancellations/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Cancellation cancellation){
        cancellationService.save(cancellation);
        return "redirect:/cancellations";

    }
    
}