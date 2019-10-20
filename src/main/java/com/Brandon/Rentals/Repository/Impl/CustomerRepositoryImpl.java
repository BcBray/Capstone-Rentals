package com.Brandon.Rentals.Repository.Impl;

import com.Brandon.Rentals.Domain.Customer;
import com.Brandon.Rentals.Repository.CustomerRepository;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@Repository("CustomerInMemory")
public class CustomerRepositoryImpl implements CustomerRepository {

    private static CustomerRepositoryImpl customerRepository = null;
    private Set<Customer> customers;

    public CustomerRepositoryImpl(){
        customers = new HashSet<>();
    }

    public static CustomerRepositoryImpl getCustomerRepository() {

        if(customerRepository == null){
            return new CustomerRepositoryImpl();
        }

        return customerRepository;
    }

    @Override
    public Customer create(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public Customer read(String id) {
        return customers.stream().filter(customer -> customer.getId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Customer update(Customer customer) {

        Customer inDB = read(customer.getId());

        if(inDB != null){
            customers.remove(inDB);
            customers.add(customer);
            return customer;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Customer inDB = read(id);
        customers.remove(inDB);
    }

    @Override
    public Set<Customer> getAll() {

        return customers;
    }
}
