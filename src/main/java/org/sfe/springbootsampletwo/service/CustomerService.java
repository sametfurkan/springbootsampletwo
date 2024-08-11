package org.sfe.springbootsampletwo.service;

import org.sfe.springbootsampletwo.exception.CustomerNotFoundException;
import org.sfe.springbootsampletwo.model.Customer;
import org.sfe.springbootsampletwo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(
                () -> new CustomerNotFoundException("Customer could not found by id: " + id));
    }
}
