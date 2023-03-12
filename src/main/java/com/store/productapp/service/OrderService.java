package com.store.productapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.store.productapp.data.Order;

@Service
public class OrderService {

    private List<Order> orders = new ArrayList<>();

    public OrderService(){
        orders.add(new Order(1,1,"Samsung, Iphone",2,1500));
        orders.add(new Order(2,2,"PS 5, Harman/kardon soundbar, ",2,2000));
        orders.add(new Order(3,3,"Samsung",1,300));
        orders.add(new Order(4,4,"Asus notebook",1,1500));
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public List<Order> getOrders(){
        return new ArrayList<>(orders);
    }

    public Order findOrder(int orderid){
        for (Order order : orders) {
            if(order.getOrderid() == orderid){
                return order;
            }
        }
        return null;
    }

    public boolean removeOrder(int orderid){
        Order o = findOrder(orderid);

        if(o != null){
            return orders.remove(o);
        }
        return false;
    }
}
