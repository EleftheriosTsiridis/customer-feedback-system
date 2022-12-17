package com.lefteris.customer.feedback.system.service;

import com.lefteris.customer.feedback.system.entity.Customer;
import com.lefteris.customer.feedback.system.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostConstructService {

    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    @Transactional
    void createCustomers() {
        Customer customer1 = new Customer();
        customer1.setLastName("Nikas");
        customer1.setFirstName("Nikos");

        customerRepository.save(customer1);

        Customer customer2 = new Customer();
        customer2.setLastName("Papa");
        customer2.setFirstName("Maria");

        customerRepository.save(customer2);
    }

}
