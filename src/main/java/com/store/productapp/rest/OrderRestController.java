package com.store.productapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.productapp.data.Order;
import com.store.productapp.service.OrderService;

@RestController
public class OrderRestController {

    @Autowired
    OrderService os;
    
    public OrderRestController(OrderService os){
        this.os = os;
    }

    @GetMapping("/orders")
    public List<Order> getOrders(){
        return os.getOrders();
    }

    @PostMapping("/order")
    public String deleteOrder(@RequestBody Order order){
        os.removeOrder(order.getCustorderid());
        return "Order removed";
    }

    @GetMapping("/order/{orderid}")
    public ResponseEntity<Order> getOrder(@PathVariable int orderid){
        Order o = os.findOrder(orderid);

        if (o != null){
            return new ResponseEntity<>(o, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
        
