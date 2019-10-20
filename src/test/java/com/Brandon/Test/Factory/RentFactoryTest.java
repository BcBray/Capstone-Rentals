package com.Brandon.Test.Factory;

import com.Brandon.Rentals.Domain.Rent;
import com.Brandon.Rentals.Factory.RentFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentFactoryTest {

    @Test
    public void getRent() {

        String bookingId = "12ab";
        int customerId = 123456890;
        Rent r = RentFactory.getRent(bookingId, customerId);
        System.out.println(r);
        Assert.assertNotNull(r);
    }


}