package com.store.productapp.data;

public class Customer {
    private String fname;
    private String lname;
    private String pnum;
    private int custid;


    public Customer() {
    }

    public Customer(String fname, String lname, String pnum, int custid) {
        this.fname = fname;
        this.lname = lname;
        this.pnum = pnum;
        this.custid = custid;
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

    public String getPnum() {
        return this.pnum;
    }

    public void setPnum(String pnum) {
        this.pnum = pnum;
    }


    public Customer(int custid) {
        this.custid = custid;
    }

    public int getCustid() {
        return this.custid;
    }

    public void setId(int custid) {
        this.custid = custid;
    }

}
