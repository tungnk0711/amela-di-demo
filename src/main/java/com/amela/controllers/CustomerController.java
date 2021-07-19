package com.amela.controllers;

import com.amela.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    private Customer customer;

    @RequestMapping("/customers")
    public String listCustomer(){
        //Customer customer = new Customer("Ramos");

        String name = customer.getName();
        return name;
    }
}
