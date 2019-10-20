package com.Brandon.Rentals.Service.Impl;

import com.Brandon.Rentals.Domain.Manufacturer;
import com.Brandon.Rentals.Repository.Impl.ManufacturerRepositoryImpl;
import com.Brandon.Rentals.Repository.ManufacturerRepository;
import com.Brandon.Rentals.Service.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ManufacturerServiceImpl")
public class ManufacturerServiceImpl implements ManufacturerService {

    private static ManufacturerServiceImpl service = null;
    private ManufacturerRepository repository;

    private ManufacturerServiceImpl() {
        this.repository = ManufacturerRepositoryImpl.getManufacturerRepository();
    }

    public static ManufacturerServiceImpl getService(){
        if (service == null) service = new ManufacturerServiceImpl();
        return service;
    }

    @Override
    public Manufacturer create(Manufacturer manufacturer) {
        return this.repository.create(manufacturer);
    }

    @Override
    public Manufacturer update(Manufacturer manufacturer) {
        return this.repository.update(manufacturer);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Manufacturer read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Manufacturer> getAll() {
        return this.repository.getAll();
    }





}