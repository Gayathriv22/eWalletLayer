package dao;
import entities.Customer;
import exceptions.CustomerNotFoundException;

import java.util.*;

public class CustomerDaoImp implements CustomerDao {
    private Map<String, Customer> store=new HashMap<>();

    @Override
    public void addCustomer(Customer c) {
      store.put(c.getMobile(),c);
    }

    @Override
    public Customer findCustomerByMobile(String mobile) {
        Customer c=store.get(mobile);
        if (c== null) {
            throw new CustomerNotFoundException("Customer not found for this mobile number"+mobile);
        }
        return c;
    }

    @Override
    public Set<Customer> addAllCustomers() {
        Collection<Customer>customers=store.values();
        Set<Customer>customerSet=new HashSet<>(customers);
        return customerSet;
    }
}