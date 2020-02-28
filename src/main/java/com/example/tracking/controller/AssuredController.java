package com.example.tracking.controller;

import java.util.Optional;

import com.example.tracking.models.Assured;
import com.example.tracking.service.AssuredService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AssuredController {
    
    @Autowired
    private AssuredService assuredService;

    @GetMapping("/assures")
    public String getClient(Model model, String keyword){

         if(keyword != null){
           model.addAttribute("assures", assuredService.findByKeyword(keyword));
       } 
       else{
        model.addAttribute("assures", assuredService.getAssures());
       }
        return "assured";
    }

    @PostMapping("/assures/addNew")
    public String addNew(Assured assured){
        assuredService.save(assured);
        return "redirect:/assures";

    }

    @RequestMapping("/assures/findById")
    @ResponseBody
    public Optional<Assured> findById(int id){
      return   assuredService.findById(id);
    }
    
    @RequestMapping(value="/assures/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Assured assured){
        assuredService.save(assured);
        return "redirect:/assures";

    }
    
}