package com.Brandon.Test.Repository;

import com.Brandon.Rentals.Domain.Location;
import com.Brandon.Rentals.Factory.LocationFactory;
import com.Brandon.Rentals.Repository.Impl.LocationRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationRepositoryImplTest {

    @Autowired
    private LocationRepositoryImpl locationRepository;

    @Test
    public void create() {
        Location location = LocationFactory.getLocation( "Somewhere", "d44");
        locationRepository.create(location);
        assertNotNull(locationRepository.getAll());
    }


    @Test
    public void read() {
        Location location = LocationFactory.getLocation("Somewhere", "d44");
        locationRepository.create(location);
        assertNotNull(locationRepository.getAll());
        Location location1 = locationRepository.read(location.getArea());
        assertNotNull(location1);
        System.out.println(locationRepository.toString());
    }

    @Test
    public void update() {
        Location location = LocationFactory.getLocation( "where", "4");
        locationRepository.create(location);

        assertNotNull(locationRepository.getAll());

        Location location1 = LocationFactory.getLocation("where", "4");
        location1.setArea(location.getArea());
        locationRepository.update(location1);

        Location location2 = locationRepository.read(location.getArea());

        assertEquals(location1, location2);

    }

    @Test
    public void delete() {
        Location location = LocationFactory.getLocation("where", "4");
        locationRepository.create(location);
        assertNotNull(locationRepository.getAll());
        locationRepository.delete(location.getArea());
        Location notInSet = locationRepository.read(location.getArea());
        assertNull(notInSet);

    }
}