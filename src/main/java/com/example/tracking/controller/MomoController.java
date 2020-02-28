package com.example.tracking.controller;

import java.util.Optional;

import com.example.tracking.models.Momo;
import com.example.tracking.service.MomoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MomoController {
    
    @Autowired
    private MomoService momoService;

    @GetMapping("/momos")
    public String getMomo(Model model, String keyword){

      
        if(keyword != null){
            model.addAttribute("momos", momoService.findByKeyword(keyword));
        } 
        else{
         model.addAttribute("momos", momoService.getMomos());
        }
        return "momo";
    }

    @PostMapping("/momos/addNew")
    public String addNew(Momo momo){
        momoService.save(momo);
        return "redirect:/momos";

    }

    @RequestMapping("/momos/findById")
    @ResponseBody
    public Optional<Momo> findById(int id){
      return   momoService.findById(id);
    }
    
    @RequestMapping(value="/momos/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Momo momo){
        momoService.save(momo);
        return "redirect:/momos";

    }
    
}