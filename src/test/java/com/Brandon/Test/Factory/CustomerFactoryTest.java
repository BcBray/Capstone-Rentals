package com.Brandon.Test.Factory;

import com.Brandon.Rentals.Domain.Customer;
import com.Brandon.Rentals.Factory.CustomerFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerFactoryTest
{
    @Test
    public void getCustomer() {

        String name = "Gary";
        String lastName = "Fisher";
        int age = 22;
        Customer cust = CustomerFactory.getCustomer(name,lastName,age);
        System.out.println(cust.toString());
        Assert.assertNotNull(cust.getName());
    }
}
