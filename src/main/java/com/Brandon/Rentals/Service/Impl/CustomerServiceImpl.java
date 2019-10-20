package com.Brandon.Rentals.Service.Impl;

/*
import com.Brandon.Rentals.Domain.Customer;
import com.Brandon.Rentals.Repository.CustomerRepository;
import com.Brandon.Rentals.Repository.Impl.CustomerRepositoryImpl;
import com.Brandon.Rentals.Service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CustomerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

    private static CustomerServiceImpl service = null;
    private CustomerRepository repository;

    private CustomerServiceImpl() {
        this.repository = CustomerRepositoryImpl.getCustomerRepository();
    }

    public static CustomerServiceImpl getService(){
        if (service == null) service = new CustomerServiceImpl();
        return service;
    }

    @Override
    public Set<Customer> getAll() {
        return this.repository.getAll();
    }

    /*
    public Customer create(Customer course) {
        return this.repository.create(course);
    }

    @Override
    public Customer update(Customer course) {
        return this.repository.update(course);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Customer read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Customer> getAll() {
        return this.repository.getAll();
    }




}
*/