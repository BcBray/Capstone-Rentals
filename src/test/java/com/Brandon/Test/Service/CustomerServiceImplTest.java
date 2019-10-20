package com.Brandon.Test.Service;
/*
import com.Brandon.Rentals.Domain.Customer;
import com.Brandon.Rentals.Factory.CustomerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest

public class CustomerServiceImplTest {

    @Autowired
    private CustomerServiceImpl customerService;

    Customer customer = CustomerFactory.getCustomer( "James", "May",6);

    @Test
    public void create() {

        customerService.create(customer);
        assertNotNull(customerService.getAll());
        System.out.println(customerService.getAll());
    }

    @Test
    public void b_read() {
        assertNotNull(customerService.getAll());
        Customer customer1 = customerService.read(customer.getName());
        assertNotEquals(customer, customer1);
        System.out.println(customerService.getAll());
    }

    @Test
    public void c_update() {

        assertNotNull(customerService.getAll());

        Customer customer1 = CustomerFactory.getCustomer("Robertp", "May",6);
        customer1.setName(customer.getName());
        customerService.update(customer1);

        Customer customer2 = customerService.read(customer1.getName());
        assertNotEquals(customer1, customer2);
        System.out.println(customerService.getAll());
    }

    @Test
    public void d_delete() {

        assertNotNull(customerService.getAll());
        customerService.delete(customer.getName());
        Customer notInSet = customerService.read(customer.getName());
        assertNull(notInSet);
        System.out.println(customerService.getAll());
    }

}
*/
