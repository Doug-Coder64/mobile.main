package main.java.com.mobile.main.model;

import javax.persistence.*;

@entity
@table(name = "customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "mobile_customer_number", nullable = false)
    private long mobileCustomerNumber;

    @Column(name = "customerType", nullable = false)
    private String customerType;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "phone_number", nullable = false)
    private long phoneNumber;

    public Customer() {

    }

    public Customer(long mobileCustomerNumber, String customerType, String emailAddress, String firstName, 
                    String lastName, String businessName, long phoneNumber) {
        
        this.mobileCustomerNumber = mobileCustomerNumber;
        this.customerType = customerType;
        this.emailAddress = emailAddress;
        this.firstName = firstName;
        this.lastName = lastName;
        this.businessName = businessName;
        this.phoneNumber = phoneNumber;                
    }

    public long getId() {
        return id;
    }

    public getMobileCustomerNumber() {
        return mobileCustomerNumber;
    }

    public setMobileCustomerNumber(Long mobileCustomerNumber) {
        this.mobileCustomerNumber = mobileCustomerNumber;
    }

    public getCustomerType() {
        return customerType;
    }

    public setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public getEmailAddress() {
        return emailAddress;
    }

    public setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public getFirstName() {
        return firstName;
    }

    public setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public getLastName() {
        return lastName;
    }

    public setLastName(String lastName) {
        this.lastName = lastName;
    }

    public getBusinessName() {
        return businessName;
    }

    public setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public getPhoneNumber() {
        return phoneNumber;
    }

    public setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + "mobileCustomerNumber=" + mobileCustomerNumber + ", customerType=" + customerType + ", emailAddress=" + emailAddress + 
                ", firstName=" + firstName + ", lastName=" + lastName +", businessName=" + businessName + ", phone=" + phoneNumber + "]";
    }
}
