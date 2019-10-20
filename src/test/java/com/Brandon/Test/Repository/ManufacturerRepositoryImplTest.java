package com.Brandon.Test.Repository;

import com.Brandon.Rentals.Domain.Manufacturer;
import com.Brandon.Rentals.Factory.ManufacturerFactory;
import com.Brandon.Rentals.Repository.Impl.ManufacturerRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManufacturerRepositoryImplTest {

    @Autowired
    private ManufacturerRepositoryImpl manufacturerRepository;

    @Test
    public void create() {
        Manufacturer manufacturer = ManufacturerFactory.getManufacturer( "iuiu66", "Audi");
        manufacturerRepository.create(manufacturer);
        assertNotNull(manufacturerRepository.getAll());
    }

    @Test
    public void read() {
        Manufacturer manufacturer = ManufacturerFactory.getManufacturer("iuiu66", "Audi");
        manufacturerRepository.create(manufacturer);
        assertNotNull(manufacturerRepository.getAll());
        Manufacturer manufacturer1 = manufacturerRepository.read(manufacturer.getBrand());
        assertNotNull(manufacturer);
    }

    @Test
    public void update() {
        Manufacturer manufacturer = ManufacturerFactory.getManufacturer( "12333", "Bentley");
        manufacturerRepository.create(manufacturer);
        assertNotNull(manufacturerRepository.getAll());
        Manufacturer manufacturer1 = ManufacturerFactory.getManufacturer("12333", "Bentley");
        manufacturer1.setBrand(manufacturer.getBrand());
        manufacturerRepository.update(manufacturer1);
        Manufacturer manufacturer2 = manufacturerRepository.read(manufacturer.getBrand());
        assertNotEquals(manufacturer, manufacturer1);
    }

    @Test
    public void delete() {
        Manufacturer manufacturer = ManufacturerFactory.getManufacturer("12333", "Bentley");
        manufacturerRepository.create(manufacturer);
        assertNotNull(manufacturerRepository.getAll());
        manufacturerRepository.delete(manufacturer.getBrand());
        Manufacturer notInSet = manufacturerRepository.read(manufacturer.getBrand());
        assertNull(notInSet);

    }

}