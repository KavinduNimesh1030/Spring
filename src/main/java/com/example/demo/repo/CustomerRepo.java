package com.example.demo.repo;

import com.example.demo.dto.CustomerDto;
import com.example.demo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,String> {
}
