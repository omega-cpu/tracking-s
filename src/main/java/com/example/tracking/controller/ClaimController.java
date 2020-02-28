package com.example.tracking.controller;


import java.util.Optional;

import com.example.tracking.models.Claim;
import com.example.tracking.service.ClaimService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ClaimController {
    
    @Autowired
    private ClaimService claimService;

    @GetMapping("/claims")
    public String getClaim(Model model, String keyword){

        if(keyword != null){
            model.addAttribute("claims", claimService.findByKeyword(keyword));
        } 
        else{
         model.addAttribute("claims", claimService.getClaims());
        }
        return "claim";
    }

    @PostMapping("/claims/addNew")
    public String addNew(Claim claim){
        claimService.save(claim);
        return "redirect:/claims";

    }

    @RequestMapping("/claims/findById")
    @ResponseBody
    public Optional<Claim> findById(int id){
      return   claimService.findById(id);
    }
    
    @RequestMapping(value="/claims/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Claim claim){
        claimService.save(claim);
        return "redirect:/claims";

    }
    
}