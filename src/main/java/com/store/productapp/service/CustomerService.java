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
        customers.add(customer);
    }

    public List<Customer> getCustomers(){
        return new ArrayList<>(customers);
    }

    public Customer findCustomer(int custid){
        for (Customer customer : customers) {
            if(customer.getCustid() == custid){
                return customer;
            }
        }
        return null;  
    }

    public boolean removeCustomer(int custid){
        Customer c = findCustomer(custid);

        if(c != null){
            return customers.remove(c);
        }
        return false;
    }
}
