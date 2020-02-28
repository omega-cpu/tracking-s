package com.example.tracking.controller;


import java.util.Optional;

import com.example.tracking.models.Trustee;

import com.example.tracking.service.TrusteeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TrusteeController {
    
    @Autowired
    private TrusteeService trusteeService;

    @GetMapping("/trustees")
    public String Trustee(Model model, String keyword){

         model.addAttribute("trustees", trusteeService.getTrustees());
  
        return "trustee";
    }

    @PostMapping("/trustees/addNew")
    public String addNew(Trustee trustee){
        trusteeService.save(trustee);
        return "redirect:/trustees";

    }

    @RequestMapping("/trustees/findById")
    @ResponseBody
    public Optional<Trustee> findById(int id){
      return   trusteeService.findById(id);
    }
    
    @RequestMapping(value="/trustees/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Trustee trustee){
        trusteeService.save(trustee);
        return "redirect:/trustees";

    }
    
}