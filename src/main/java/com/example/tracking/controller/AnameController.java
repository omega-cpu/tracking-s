package com.example.tracking.controller;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Aname;
import com.example.tracking.service.AnameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AnameController {
    
    @Autowired
    private AnameService anameService;

    @GetMapping("/anames")
    public String getName(Model model, String keyword){

       if(keyword != null){
           model.addAttribute("anames", anameService.findByKeyword(keyword));
       } 
       else{
        
      
            List<Aname> anamelist = anameService.getAnames();
            model.addAttribute("anames", anamelist);
      
        
       }
        
      

        return "aname";
    }

    @PostMapping("/anames/addNew")
    public String addNew(Aname aname){
        anameService.save(aname);
        return "redirect:/anames";

    }

    @RequestMapping("/anames/findById")
    @ResponseBody
    public Optional<Aname> findById(int id){
      return   anameService.findById(id);
    }
    
    @RequestMapping(value="/anames/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Aname aname){
        anameService.save(aname);
        return "redirect:/anames";

    }
    
}