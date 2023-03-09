package com.store.productapp.data;

public class Order {
    private int orderid;
    private int custorderid;
    private String orderproducts;
    private int quantity;
    private double totalprice;


    public Order() {
    }

    public Order(int orderid, int custorderid, String orderproducts, int quantity, double totalprice) {
        this.orderid = orderid;
        this.custorderid = custorderid;
        this.orderproducts = orderproducts;
        this.quantity = quantity;
        this.totalprice = totalprice;
    }

    public int getOrderid() {
        return this.orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public int getCustorderid() {
        return this.custorderid;
    }

    public void setCustorderid(int custorderid) {
        this.custorderid = custorderid;
    }

    public String getOrderproducts() {
        return this.orderproducts;
    }

    public void setOrderproducts(String orderproducts) {
        this.orderproducts = orderproducts;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalprice() {
        return this.totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public Order orderid(int orderid) {
        setOrderid(orderid);
        return this;
    }

    public Order custorderid(int custorderid) {
        setCustorderid(custorderid);
        return this;
    }

    public Order orderproducts(String orderproducts) {
        setOrderproducts(orderproducts);
        return this;
    }

    public Order quantity(int quantity) {
        setQuantity(quantity);
        return this;
    }

    public Order totalprice(double totalprice) {
        setTotalprice(totalprice);
        return this;
    }



}
