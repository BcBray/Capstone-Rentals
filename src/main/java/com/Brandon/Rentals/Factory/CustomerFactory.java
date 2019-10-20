package com.Brandon.Rentals.Factory;

import com.Brandon.Rentals.Domain.Customer;

public class CustomerFactory {



    public static Customer getCustomer(String name, String lastName, int age) {

        return new Customer.Builder()

                .name(name)
                .lastName(lastName)
                .age(age)
                .build();

    }

}