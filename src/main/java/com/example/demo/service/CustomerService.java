package com.example.demo.service;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import com.example.demo.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService{
    @Autowired
    private CustomerRepo customerRepo;
    public String SaveCustomer(CustomerDto customerDto){

        customerRepo.save(new Customer(customerDto.getId(),customerDto.getName(),customerDto.getAddress(),customerDto.getSalary()));
        return "Success";
    }
}
