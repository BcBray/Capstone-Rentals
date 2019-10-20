package com.Brandon.Test.Repository;

import com.Brandon.Rentals.Domain.Rent;
import com.Brandon.Rentals.Factory.RentFactory;
import com.Brandon.Rentals.Repository.Impl.RentRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class RentRepositoryImplTest {

    @Autowired
    private RentRepositoryImpl rentRepository;

    @Test
    public void create() {
        Rent rent = RentFactory.getRent( "2", 2);
        rentRepository.create(rent);
        assertNotNull(rentRepository.getAll());
    }

    @Test
    public void read() {
        Rent rent = RentFactory.getRent("2", 2);
        rentRepository.create(rent);
        assertNotNull(rentRepository.getAll());
        Rent rent1 = rentRepository.read(rent.getBookingId());
        assertNotNull(rent1);
    }

    @Test
    public void update() {
        Rent rent = RentFactory.getRent( "1", 1);
        rentRepository.create(rent);

        assertNotNull(rentRepository.getAll());

        Rent rent1 = RentFactory.getRent("1", 1);
        rent1.setBookingId(rent.getBookingId());
        rentRepository.update(rent1);
        Rent rent2 = rentRepository.read(rent.getBookingId());
        assertEquals(rent1, rent2);
    }

    @Test
    public void delete() {
        Rent rent = RentFactory.getRent("1", 1);
        rentRepository.create(rent);
        assertNotNull(rentRepository.getAll());
        rentRepository.delete(rent.getBookingId());
        Rent notInSet = rentRepository.read(rent.getBookingId());
        assertNull(notInSet);

    }

}