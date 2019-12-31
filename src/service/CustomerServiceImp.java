package service;

import dao.CustomerDao;
import entities.Customer;
import exceptions.IncorrectMobileNumberException;

import java.util.Set;

public class CustomerServiceImp implements CustomerService {
    private CustomerDao dao;

    public CustomerServiceImp(
            CustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public void addServiceCustomer(Customer c) {
        dao.addCustomer(c);

    }

    @Override
    public Customer findCustomerByMobile(String mobile) {
        if (mobile==null || mobile.length()<10) {
            throw new IncorrectMobileNumberException("there is no customer for this id");

        }
        Customer c = dao.findCustomerByMobile(mobile);
        return c;
    }

    @Override
    public Set<Customer> addAllCustomers() {
        Set<Customer> customers = dao.addAllCustomers();
        return customers;
    }
}


