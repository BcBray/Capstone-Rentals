package com.Brandon.Test.Factory;

import com.Brandon.Rentals.Domain.ReturnCar;
import com.Brandon.Rentals.Factory.ReturnCarFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReturnCarFactoryTest {

    @Test
    public void getReturnCar() {

        String regNo = "12ab";
        int customerId = 123456890;
        double pay = 200;
        ReturnCar rc = ReturnCarFactory.getReturnCar(regNo, customerId, pay);
        System.out.println(rc);
        Assert.assertNotNull(rc);
    }



}