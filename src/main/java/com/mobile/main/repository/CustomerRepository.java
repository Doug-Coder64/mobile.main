package main.java.com.mobile.main.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mobile.main.model.customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByMobileCustomerNumber(long mobileCustomerNumber);
    
    List<Customer> findByCustomerType(String customerType);

    List<Customer> findByEmailAddress(String emailAddress);

    List<Customer> findByPhoneNumber(String phoneNumber);
}


