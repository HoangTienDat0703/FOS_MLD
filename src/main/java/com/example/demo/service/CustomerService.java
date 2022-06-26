package com.example.demo.service;

import com.example.demo.entities.Customer;
import com.example.demo.implementService.ICustomerService;
import com.example.demo.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        if(customer != null){
            Customer customer1 = customerRepository.getById(customer.getCustomerId());
            if(customer1 != null){
                customer1.setFirstName(customer.getFirstName());
                customer1.setLastName(customer.getLastName());
                customer1.setContact(customer.getContact());
                customer1.setEmail(customer.getEmail());
                customer1.setAddress(customer.getAddress());

                return customerRepository.save(customer1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteCustomer(Long id) {
        Customer customer = customerRepository.getById(id);
        if(customer != null){
            customerRepository.delete(customer);
            return true;
        }
        return false;
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> getCustomerById(Long id) {
        return Optional.empty();
    }
}
