package com.amela.controllers;

import com.amela.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private Customer customer;

    @RequestMapping("/customers")
    public String listCustomer(){
        //Customer customer = new Customer("Ramos");

        String name = customer.getName();
        return name;
    }


    @RequestMapping("/index/{id}")
    public String getIndex(@PathVariable Long id){

        return "index";
    }

    @RequestMapping("/create")
    public String showForm(ModelMap model) {
        model.addAttribute("customer", new Customer());
        return "customer/create";
    }

    @RequestMapping(value = "/add")
    public String submit(@ModelAttribute("customer") Customer customer, BindingResult result, ModelMap model) {

        return "";
    }
}
