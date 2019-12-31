package ui;

import java.util.*;

import dao.CustomerDao;
import dao.CustomerDaoImp;
import entities.Customer;
import service.CustomerService;
import service.CustomerServiceImp;

public class CustomerUi {
    private CustomerService cs = new CustomerServiceImp(new CustomerDaoImp());

    public static void main(String[] args) {
        CustomerUi c1 = new CustomerUi();
        c1.runUi();

    }

    public void runUi() {
        try {
            Customer c0 = new Customer("9896734457", "sid", 3990);
            Customer c1 = new Customer("9999966666", "Bala", 3000);
            cs.addServiceCustomer(c0);
            cs.addServiceCustomer(c1);
            Customer fetched1 = cs.findCustomerByMobile("9896734457");
            Customer fetched2 = cs.findCustomerByMobile("9999966666");
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            Set<Customer> c4 = new HashSet<>();
            c4 = cs.addAllCustomers();
            print(c4);

        } catch (Throwable c) {
            System.out.println("something went wrong");
        }
    }

    void print(Collection<Customer> customers) {
        for (Customer c:
             customers) {
            System.out.println(c.getName());
            System.out.println(c.getMobile());

        }
    }

}
