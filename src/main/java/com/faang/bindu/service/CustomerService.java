package com.faang.bindu.service;

import com.faang.bindu.entity.Customer;
import com.faang.bindu.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo repo;

    public void insertData(Customer cust){
        repo.insert(cust);
    }

    public void insertAllRecordes(@RequestBody List<Customer> cust){
        repo.insert(cust);
    }

    public  Optional<Customer> findValue(Integer id){
        Optional<Customer> cus=repo.findById(id);
        return cus;
    }

    public List<Customer>  getAllRecord(){
        List<Customer> li=repo.findAll();
        return li;
    }

    public void deleteData( Integer id){
        repo.deleteById(id);
    }

    public void deleteAllData(){
        repo.deleteAll();
    }
}
