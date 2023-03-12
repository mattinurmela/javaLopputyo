package com.store.productapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.productapp.data.Customer;

@Service
public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public CustomerService(){
        customers.add(new Customer("Matti", "Esko", "01234567",1));
        customers.add(new Customer("Matti", "Meikäläinen", "01234567",2));
        customers.add(new Customer("Teppo", "Testi", "01234567",3));   
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
