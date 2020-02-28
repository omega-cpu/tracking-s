package com.example.tracking.controller;


import java.util.Optional;

import com.example.tracking.models.Refund;

import com.example.tracking.service.RefundService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RefundController {
    
    @Autowired
    private RefundService refundService;

    @GetMapping("/refunds")
    public String getRefund(Model model,String keyword){

        
        if(keyword != null){
            model.addAttribute("refunds", refundService.findByKeyword(keyword));
        } 
        else{
         model.addAttribute("refunds", refundService.getRefunds());
        }
        return "refund";
    }

    @PostMapping("/refunds/addNew")
    public String addNew(Refund refund){
        refundService.save(refund);
        return "redirect:/refunds";

    }

    @RequestMapping("/refunds/findById")
    @ResponseBody
    public Optional<Refund> findById(int id){
      return   refundService.findById(id);
    }
    
    @RequestMapping(value="/refunds/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Refund refund){
        refundService.save(refund);
        return "redirect:/refunds";

    }
    
}