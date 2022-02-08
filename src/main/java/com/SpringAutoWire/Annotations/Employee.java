package com.SpringAutoWire.Annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    //    @Autowired
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Calling Setter Method");
        this.address = address;
    }

    @Autowired
    public Employee(Address address) {
//        super();
        System.out.println("Calling Emp Constructor");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
