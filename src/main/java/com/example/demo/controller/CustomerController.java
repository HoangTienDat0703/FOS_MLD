package com.example.demo.controller;

import com.example.demo.entities.Customer;
import com.example.demo.entities.FOSUser;
import com.example.demo.implementService.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/customers")
    private List<Customer> getAllCustomer(){
        return iCustomerService.getAllCustomer();
    }

    @PostMapping("/customers/add")
    private Customer saveCustomer(@RequestBody Customer customer){
        return iCustomerService.addCustomer(customer);
    }

    @PutMapping("/customers/update")
    private Customer updateFOSUser(@RequestBody Customer customer){
        return iCustomerService.updateCustomer(customer);
    }

    @DeleteMapping("/customers/delete/{id}")
    public boolean deletecustomers(@PathVariable("id") Long id){
        return iCustomerService.deleteCustomer(id);
    }


}
