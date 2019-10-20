package com.Brandon.Test.Service;

import com.Brandon.Rentals.Domain.Location;
import com.Brandon.Rentals.Factory.LocationFactory;
import com.Brandon.Rentals.Service.Impl.LocationServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationServiceImplTest {

    @Autowired
    private LocationServiceImpl locationService;

    Location location = LocationFactory.getLocation( "Somewhere", "Bellville");

    @Test
    public void create() {

        locationService.create(location);
        assertNotNull(locationService.getAll());
        System.out.println(locationService.getAll());
    }

    @Test
    public void b_read() {
        assertNotNull(locationService.getAll());
        Location location1 = locationService.read(location.getArea());
        assertNotEquals(location, location1);
        System.out.println(locationService.getAll());
    }

    @Test
    public void c_update() {

        assertNotNull(locationService.getAll());
        Location location1 = LocationFactory.getLocation("Some", "Bell");
        location1.setArea(location.getArea());
        locationService.update(location1);
        Location location2 = locationService.read(location1.getArea());
        assertNotEquals(location1, location2);
        System.out.println(locationService.getAll());
    }

    @Test
    public void d_delete() {

        assertNotNull(locationService.getAll());
        locationService.delete(location.getArea());
        Location notInSet = locationService.read(location.getArea());
        assertNull(notInSet);
        System.out.println(locationService.getAll());
    }


}