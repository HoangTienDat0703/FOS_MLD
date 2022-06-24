package com.example.demo.implementService;

import com.example.demo.entities.Category;
import com.example.demo.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    public Customer addCustomer(Customer customer);

    public Customer updateCustomer(Customer customer);

    public boolean deleteCustomer(Long id);

    public List<Customer> getAllCustomer();

    public Optional<Customer> getCustomerById(Long id);
}
