package service;

import entities.Customer;

import java.util.Set;

public interface CustomerService {
    void addServiceCustomer(Customer c);
    Customer  findCustomerByMobile(String mobile);
    Set<Customer> addAllCustomers();
}
