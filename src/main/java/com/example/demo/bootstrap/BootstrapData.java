package com.example.demo.bootstrap;

import com.example.demo.domain.Customer;
import com.example.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final CustomerRepository customerRepository;

    @Autowired
    public BootstrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading Customers ...");

        Customer customer1 = new Customer();
        customer1.setFirstName("Michael");
        customer1.setLastName("Sidorow");
        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setFirstName("Steven");
        customer2.setLastName("Wozniak");
        customerRepository.save(customer2);

        Customer customer3 = new Customer();
        customer3.setFirstName("Joanna");
        customer3.setLastName("Sky");
        customerRepository.save(customer3);

        System.out.println("Customer saved "+ customerRepository.count());
    }
}
