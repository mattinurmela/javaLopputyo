package com.store.productapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.productapp.data.Customer;
import com.store.productapp.service.CustomerService;

@RestController
public class CustomerRestController {
    
    @Autowired
    CustomerService cs;

    public CustomerRestController(CustomerService cs){
        this.cs = cs;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return cs.getCustomers();
    }

    @PostMapping("/customer")
    public String addCustomer(@RequestBody Customer customer){
        cs.addCustomer(customer);
        return "Customer added";
    }

    @DeleteMapping("/customer")
    public String deleteCustomer(@RequestBody Customer customer){
        cs.removeCustomer(customer.getCustid());
        return "Customer removed";
    }

    @GetMapping("/customer/{custid}")
    public ResponseEntity<Customer> getCustomer(@PathVariable int custid){
        Customer c = cs.findCustomer(custid);

        if(c != null){
            return new ResponseEntity<>(c, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
