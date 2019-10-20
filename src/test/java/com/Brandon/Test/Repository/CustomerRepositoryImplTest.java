package com.Brandon.Test.Repository;

import com.Brandon.Rentals.Domain.Customer;
import com.Brandon.Rentals.Factory.CustomerFactory;
import com.Brandon.Rentals.Repository.Impl.CustomerRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryImplTest {

    @Autowired
    private CustomerRepositoryImpl customerRepository;



    @Test
    public void create() {
        Customer customer = CustomerFactory.getCustomer( "Brand", "Bran", 20);
        customerRepository.create(customer);
        assertNotNull(customerRepository.getAll());
    }

    @Test
    public void read() {
        Customer customer = CustomerFactory.getCustomer("Brand", "Bran", 20);
        customerRepository.create(customer);
        assertNotNull(customerRepository.getAll());
        //Customer customer1 = customerRepository.read(customer.getName());
        //assertEquals(customer, customer1);
    }

    @Test
    public void update() {
        Customer customer = CustomerFactory.getCustomer( "Jan", "Janet", 12);
        customerRepository.create(customer);
        assertNotNull(customerRepository.getAll());
        Customer customer1 = CustomerFactory.getCustomer("Jan", "Janet", 12);
        customer1.setName(customer.getName());
        customerRepository.update(customer1);
        Customer customer2 = customerRepository.read(customer.getName());
        assertEquals(customer, customer1);
    }

    @Test
    public void delete() {

        Customer customer = CustomerFactory.getCustomer("Jan", "Janet", 12);
        customerRepository.create(customer);
        assertNotNull(customerRepository.getAll());
        customerRepository.delete(customer.getName());
        //Customer notInSet = customerRepository.read(customer.getName());
        //assertNull(notInSet);

    }
}