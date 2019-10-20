package com.Brandon.Test.Factory;

import com.Brandon.Rentals.Domain.Vehicle;
import com.Brandon.Rentals.Factory.VehicleFactory;
import org.junit.Assert;
import org.junit.Test;


public class VehicleFactoryTest {


    @Test
    public void getVehicle() {

        String regNo = "cx112";
        int type = 1;
        Vehicle v = VehicleFactory.getVehicle(regNo,type);
        System.out.println(v);
        Assert.assertNotNull(v.getRegNo());
    }
}
