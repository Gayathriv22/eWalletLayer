package entities;

import java.util.Set;
import java.util.*;

public class Customer {
    private String mobile;
    private String name;
    private double balance;

    public Customer(String mobile, String name, double balance) {
        this.mobile = mobile;
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void addsalary(double salary) {
        balance = balance + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) o;
        return customer.mobile.equals(this.mobile);
    }

    @Override
    public int hashCode() {
        return mobile.hashCode();
    }
}
