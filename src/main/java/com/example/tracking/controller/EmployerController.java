package com.example.tracking.controller;


import java.util.Optional;

import com.example.tracking.models.Employer;
import com.example.tracking.service.EmployerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class EmployerController {
    
    @Autowired
    private EmployerService employerService;

    @GetMapping("/employers")
    public String getEmployer(Model model, String keyword){

       
        if(keyword != null){
            model.addAttribute("employers", employerService.findByKeyword(keyword));
        } 
        else{
         model.addAttribute("employers", employerService.getEmployers());
        }
        return "employer";
    }

    @PostMapping("/employers/addNew")
    public String addNew(Employer employer){
        employerService.save(employer);
        return "redirect:/employers";

    }

    @RequestMapping("/employers/findById")
    @ResponseBody
    public Optional<Employer> findById(int id){
      return   employerService.findById(id);
    }
    
    @RequestMapping(value="/employers/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Employer employer){
        employerService.save(employer);
        return "redirect:/employers";

    }
    
}