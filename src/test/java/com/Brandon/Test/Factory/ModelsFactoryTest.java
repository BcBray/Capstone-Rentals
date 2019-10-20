package com.Brandon.Test.Factory;

import com.Brandon.Rentals.Domain.Models;
import com.Brandon.Rentals.Factory.ModelsFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModelsFactoryTest {

    @Test
    public void getModels() {

        String suvId = "cx123";
        String carId = "cv321";

        Models ms = ModelsFactory.getModels(suvId, carId);
        System.out.println(ms.getSuvId() + "\n"+ms.getCarId());
        Assert.assertNotNull(ms.getSuvId());
        Assert.assertNotNull(ms.getCarId());

    }

}
