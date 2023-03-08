package com.store.productapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.store.productapp.service.CustomerService;

@RestController
public class CustomerRestController {
    
    @Autowired
    CustomerService cs;

    public CustomerRestController(CustomerService cs){
        this.cs = cs;
    }
}
