package main.java.com.mobile.main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.main.model.Customer;
import com.mobile.main.repository.CustomerRepostitory;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class CustomerController {
    
    @Autowired
    CustomerRepostitory CustomerRepostitory;

    @GetMapping("/customers")
    public responseEntity<List<Customer>> getAllCustomers(@RequestParam(required = false) Long mobileCustomerNumber){
        try {
            List<Customer> customers = new ArrayList<Customer>();
            if(mobileCustomerNumber == null){
                CustomerRepostitory.findAll().foreach(customers::add);
            } else {
                customerRepository.findByMobileCustomerNumber(mobileCustomerNumber).foreach(customers::add);
            }
            if(customers.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(customers, HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") long id){
        Optional<Customer> customerData = customerRepository.findById(id);

        if(customerData.isPresent()) {
            return new ResponseEntity<>(customerData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    // @GetMapping("/customers/{mobileCustomerNumber}")
    // public ResponseEntity<Customer> getCustomerByMobileCustomerNumber(@PathVariable("mobileCustomerNumber") long mobileCustomerNumber){
    //     Optional<Customer> customerData = customerRepository.findByMobileCustomerNumber(mobileCustomerNumber);

    //     if(customerData.isPresent()) {
    //         return new ResponseEntity<>(customerData.get(), HttpStatus.OK);
    //     } else {
    //         return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    //     }
    // }

    @PostMapping("/customers")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        try {
            Customer _customer = customerRepository
            .save(new Customer(customer., customer.get))
        }
    }
}
