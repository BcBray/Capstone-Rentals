package com.Brandon.Test.Service;

import com.Brandon.Rentals.Domain.Manufacturer;
import com.Brandon.Rentals.Factory.ManufacturerFactory;
import com.Brandon.Rentals.Service.Impl.ManufacturerServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest

public class ManufacturerServiceImplTest {

    @Autowired
    private ManufacturerServiceImpl manufacturerService;

    Manufacturer manufacturer = ManufacturerFactory.getManufacturer( "yu67", "BMW");

    @Test
    public void create() {

        manufacturerService.create(manufacturer);
        assertNotNull(manufacturerService.getAll());
        System.out.println(manufacturerService.getAll());
    }

    @Test
    public void b_read() {
        assertNotNull(manufacturerService.getAll());
        Manufacturer manufacturer1 = manufacturerService.read(manufacturer.getBrand());
        assertNotEquals(manufacturer, manufacturer1);
        System.out.println(manufacturerService.getAll());
    }

    @Test
    public void c_update() {

        assertNotNull(manufacturerService.getAll());

        Manufacturer manufacturer1 = ManufacturerFactory.getManufacturer("yu67", "BMW");
        manufacturer1.setBrand(manufacturer.getBrand());
        manufacturerService.update(manufacturer1);

        Manufacturer manufacturer2 = manufacturerService.read(manufacturer1.getBrand());
        assertNotEquals(manufacturer1, manufacturer2);
        System.out.println(manufacturerService.getAll());
    }

    @Test
    public void d_delete() {

        assertNotNull(manufacturerService.getAll());
        manufacturerService.delete(manufacturer.getBrand());
        Manufacturer notInSet = manufacturerService.read(manufacturer.getBrand());
        assertNull(notInSet);
        System.out.println(manufacturerService.getAll());
    }
}