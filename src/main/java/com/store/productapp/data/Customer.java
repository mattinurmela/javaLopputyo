package com.store.productapp.data;

public class Customer {
    private String fname;
    private String lname;
    private int pnum;


    public Customer() {
    }

    public Customer(String fname, String lname, int pnum) {
        this.fname = fname;
        this.lname = lname;
        this.pnum = pnum;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPnum() {
        return this.pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

}
