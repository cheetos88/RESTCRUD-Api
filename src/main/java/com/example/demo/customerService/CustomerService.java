package com.example.demo.customerService;

import com.example.demo.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Optional<Customer> findCustomerById(Long id);
    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
