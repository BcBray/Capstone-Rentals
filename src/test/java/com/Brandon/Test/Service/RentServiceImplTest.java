package com.Brandon.Test.Service;

import com.Brandon.Rentals.Domain.Rent;
import com.Brandon.Rentals.Factory.RentFactory;
import com.Brandon.Rentals.Service.Impl.RentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest

public class RentServiceImplTest {

    @Autowired
    private RentServiceImpl rentService;

    Rent rent = RentFactory.getRent( "James", 6);

    @Test
    public void create() {

        rentService.create(rent);
        assertNotNull(rentService.getAll());
        System.out.println(rentService.getAll());
    }

    @Test
    public void read() {
        assertNotNull(rentService.getAll());
        Rent rent1 = rentService.read(rent.getBookingId());
        assertNotEquals(rent, rent1);
        System.out.println(rentService.getAll());
    }

    @Test
    public void update() {

        assertNotNull(rentService.getAll());

        Rent rent1 = RentFactory.getRent("James", 6);
        rent1.setBookingId(rent.getBookingId());
        rentService.update(rent1);

        Rent rent2 = rentService.read(rent1.getBookingId());
        assertNotEquals(rent1, rent2);
        System.out.println(rentService.getAll());
    }

    @Test
    public void delete() {

        assertNotNull(rentService.getAll());
        rentService.delete(rent.getBookingId());
        Rent notInSet = rentService.read(rent.getBookingId());
        assertNull(notInSet);
        System.out.println(rentService.getAll());
    }

}