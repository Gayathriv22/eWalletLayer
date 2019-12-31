package dao;

import entities.Customer;
import java.util.*;

public interface CustomerDao {
    void addCustomer(Customer c);
    Customer findCustomerByMobile(String mobile);
    Set<Customer>addAllCustomers();
    }

