package com.example.tracking.controller;


import java.util.Optional;

import com.example.tracking.models.Client;
import com.example.tracking.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ClientController {
    
    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public String getClient(Model model, String keyword){

       
        if(keyword != null){
            model.addAttribute("clients", clientService.findByKeyword(keyword));
        } 
        else{
         model.addAttribute("clients", clientService.getClients());
        }
        return "client";
    }

    @PostMapping("/clients/addNew")
    public String addNew(Client client){
        clientService.save(client);
        return "redirect:/clients";

    }

    @RequestMapping("/clients/findById")
    @ResponseBody
    public Optional<Client> findById(int id){
      return   clientService.findById(id);
    }
    
    @RequestMapping(value="/clients/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Client client){
        clientService.save(client);
        return "redirect:/clients";

    }
    
}