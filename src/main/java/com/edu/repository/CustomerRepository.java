package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.dao.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
