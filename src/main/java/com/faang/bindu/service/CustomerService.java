package com.faang.bindu.service;

import com.faang.bindu.entity.Customer;
import com.faang.bindu.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo repo;

    public void insertData(Customer cust){
        repo.insert(cust);
    }
}
