package com.faang.bindu.controller;

import com.faang.bindu.entity.Customer;
import com.faang.bindu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    CustomerService ser;

    @PostMapping("/insert")
    public String insertData(@RequestBody Customer cust){
        ser.insertData(cust);
        return "Record inserted --->"+cust.getCno();
    }

    @PostMapping("/insertall")
    public  String insertAllRecordes(@RequestBody List<Customer> cust){
        ser.insertAllRecordes(cust);
        return "all recodes added";
    }

    @GetMapping("/getbyid")
    public Optional<Customer> findValue(@RequestBody Customer cust){
          return ser.findValue(cust.getCno());
    }

    @GetMapping("/getall")
    public List<Customer> getAllRecord(){
        return ser.getAllRecord();
    }

    @DeleteMapping("/delete")
    public String deleteData(@RequestBody Customer cus){
        ser.deleteData(cus.getCno());
          return "Record deleted :"+cus.getCno();
    }

    @DeleteMapping("/deleteall")
    public String deleteAllData(){
        ser.deleteAllData();
        return "record detleted All Recordes : ";
    }

}
