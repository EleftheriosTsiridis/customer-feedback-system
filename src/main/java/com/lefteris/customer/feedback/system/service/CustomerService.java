package com.lefteris.customer.feedback.system.service;

import com.lefteris.customer.feedback.system.dto.CreateCustomerDTO;
import com.lefteris.customer.feedback.system.dto.RetrieveCustomerDTO;
import com.lefteris.customer.feedback.system.entity.Customer;
import com.lefteris.customer.feedback.system.repository.CustomerRepository;
import org.springframework.beans.factory.   annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public void createCustomer(CreateCustomerDTO createCustomerDTO) {

        Customer customer = new Customer();

        customer.setFirstName(createCustomerDTO.getFirstName());
        customer.setLastName(createCustomerDTO.getLastName());

        customerRepository.save(customer);

    }

    @Transactional(readOnly = true)
    public List<RetrieveCustomerDTO> retrieveAllCustomers() {

        List<Customer> customers = customerRepository.findAll();

        return map(customers);
    }


    private List<RetrieveCustomerDTO> map(List<Customer> customers) {

        List<RetrieveCustomerDTO> customerDTOS = new ArrayList<>();

        for (Customer customer : customers) {
            RetrieveCustomerDTO retrievedCustomer = map(customer);
            customerDTOS.add(retrievedCustomer);
        }

        return customerDTOS;
    }

    private RetrieveCustomerDTO map(Customer customer) {
        RetrieveCustomerDTO dto = new RetrieveCustomerDTO();

        dto.setId(customer.getId());
        dto.setFirstName(customer.getFirstName());
        dto.setLastName(customer.getLastName());

        return dto;
    }
}
