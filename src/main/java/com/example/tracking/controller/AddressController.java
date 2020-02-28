package com.example.tracking.controller;

import java.util.List;
import java.util.Optional;

import com.example.tracking.models.Address;
import com.example.tracking.service.AddressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class AddressController {
    
    @Autowired
    private AddressService addressService;

    @GetMapping("/addresses")
    public String getClient(Model model){

        List<Address> addressList = addressService.getAddresses();
        model.addAttribute("addresses", addressList);
        return "address";
    }

    @PostMapping("/address/addNew")
    public String addNew(Address address){
        addressService.save(address);
        return "redirect:/addresses";

    }

    @RequestMapping("/addresses/findById")
    @ResponseBody
    public Optional<Address> findById(int id){
      return   addressService.findById(id);
    }
    
    @RequestMapping(value="/addresses/update", method={RequestMethod.PUT, RequestMethod.GET})
    public String update(Address address){
        addressService.save(address);
        return "redirect:/addresses";

    }
    
}