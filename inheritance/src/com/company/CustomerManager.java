package com.company;

public class CustomerManager {
    public void add(Customer customer){
        System.out.println(customer.customerNumber + " kaydedildi.");
    }

    public void addMultiple(Customer[] customers){
        for(Customer customer : customers){
            add(customer);
        }
    }

    public void addMultiple2(Customer... customers){
        for(Customer c :customers){
            add(c);
        }
    }

}
