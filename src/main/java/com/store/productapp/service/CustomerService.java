package com.store.productapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.productapp.data.Customer;

@Service
public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public CustomerService(){
        
    }

    public void addCustomer(Customer customer){
        customer.add(customer);
    }

    public Customer findCustomer(){
        
    }

    public void addProduct(){
        
    }
}
