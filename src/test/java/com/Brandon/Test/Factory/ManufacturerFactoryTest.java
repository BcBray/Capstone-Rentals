package com.Brandon.Test.Factory;

import com.Brandon.Rentals.Domain.Manufacturer;
import com.Brandon.Rentals.Factory.ManufacturerFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManufacturerFactoryTest {


    @Test
    public void getLogin() {

        String vehicleId = "cxz6325";
        String brand = "Bentley";

        Manufacturer m = ManufacturerFactory.getManufacturer(vehicleId, brand);
        System.out.println(m.getVehicleId() + "\n"+m.getBrand());
        Assert.assertNotNull(m.getVehicleId());
        Assert.assertNotNull(m.getBrand());

    }

}
