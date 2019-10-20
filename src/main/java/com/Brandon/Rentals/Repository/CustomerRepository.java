package com.Brandon.Rentals.Repository;



import com.Brandon.Rentals.Domain.Customer;
import com.Brandon.Rentals.Repository.IRepository;

import java.util.Set;

public interface CustomerRepository extends IRepository<Customer,String> {
    Set<Customer> getAll();

}
