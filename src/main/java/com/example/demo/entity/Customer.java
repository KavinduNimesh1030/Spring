package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    String id;
    String name;
    String address;
    String salary;

}
