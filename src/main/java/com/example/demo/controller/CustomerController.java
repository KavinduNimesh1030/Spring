package com.example.demo.controller;

import com.example.demo.dto.CustomerDto;
import com.example.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PutMapping("/saveCustomer")
    public CustomerDto SaveCustomer( @RequestBody CustomerDto customerDto){
       return  customerService.SaveCustomer(customerDto);

    }
}
