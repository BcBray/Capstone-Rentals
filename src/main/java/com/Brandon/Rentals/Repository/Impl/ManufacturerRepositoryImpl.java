package com.Brandon.Rentals.Repository.Impl;


import com.Brandon.Rentals.Domain.Manufacturer;
import com.Brandon.Rentals.Repository.ManufacturerRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("ManufacturerInMemory")
public class ManufacturerRepositoryImpl implements ManufacturerRepository {

    private static ManufacturerRepositoryImpl manufacturerRepository = null;
    private Set<Manufacturer> manufacturers;

    public ManufacturerRepositoryImpl(){
        manufacturers = new HashSet<>();
    }

    public static ManufacturerRepositoryImpl getManufacturerRepository() {

        if(manufacturerRepository == null){
            return new ManufacturerRepositoryImpl();
        }

        return manufacturerRepository;
    }

    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        manufacturers.add(manufacturer);
        return manufacturer;
    }

    @Override
    public Manufacturer read(String id) {

        return manufacturers.stream().filter(manufacturer -> manufacturer.getVehicleId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {

        Manufacturer inDB = read(manufacturer.getVehicleId());

        if(inDB != null){
            manufacturers.remove(inDB);
            manufacturers.add(manufacturer);
            return manufacturer;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Manufacturer inDB = read(id);
        manufacturers.remove(inDB);
    }

    @Override
    public Set<Manufacturer> getAll() {

        return manufacturers;
    }

}
