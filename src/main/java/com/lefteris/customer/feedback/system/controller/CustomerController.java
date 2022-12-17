package com.lefteris.customer.feedback.system.controller;

import com.lefteris.customer.feedback.system.controller.dto.EmptyResponseDTO;
import com.lefteris.customer.feedback.system.dto.CreateCustomerDTO;
import com.lefteris.customer.feedback.system.dto.RetrieveCustomerDTO;
import com.lefteris.customer.feedback.system.entity.Customer;
import com.lefteris.customer.feedback.system.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<EmptyResponseDTO> createCustomer(@RequestBody CreateCustomerDTO createCustomerDTO) {
        customerService.createCustomer(createCustomerDTO);

        return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<RetrieveCustomerDTO> retrieveAllCustomers() {
        return customerService.retrieveAllCustomers();
    }
}
