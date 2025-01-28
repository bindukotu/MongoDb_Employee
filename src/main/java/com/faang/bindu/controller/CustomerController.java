package com.faang.bindu.controller;

import com.faang.bindu.entity.Customer;
import com.faang.bindu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService ser;

    @PostMapping("/insert")
    public String insertData(@RequestBody Customer cust){
        ser.insertData(cust);
        return "Record inserted --->"+cust.getCno();
    }
}
