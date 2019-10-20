package com.Brandon.Test.Factory;

import com.Brandon.Rentals.Domain.Location;
import com.Brandon.Rentals.Factory.LocationFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LocationFactoryTest {

    @Test
    public void getLocation() {

        String area = "Cape Town";
        String areaCode ="7100";

        Location lo = LocationFactory.getLocation(area, areaCode);
        System.out.println(lo.getArea() + "\n"+lo.getAreaCode());
        Assert.assertNotNull(lo.getArea());
        Assert.assertNotNull(lo.getAreaCode());

    }



}
