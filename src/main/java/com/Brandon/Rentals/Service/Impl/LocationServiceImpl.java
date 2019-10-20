package com.Brandon.Rentals.Service.Impl;


import com.Brandon.Rentals.Domain.Location;
import com.Brandon.Rentals.Repository.Impl.LocationRepositoryImpl;
import com.Brandon.Rentals.Repository.LocationRepository;
import com.Brandon.Rentals.Service.LocationService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("LocationServiceImpl")
public class LocationServiceImpl implements LocationService {

    private static LocationServiceImpl service = null;
    private LocationRepository repository;

    private LocationServiceImpl() {
        this.repository = LocationRepositoryImpl.getLocationRepository();
    }

    public static LocationServiceImpl getService(){
        if (service == null) service = new LocationServiceImpl();
        return service;
    }

    @Override
    public Location create(Location location) {
        return this.repository.create(location);
    }

    @Override
    public Location update(Location location) {
        return this.repository.update(location);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Location read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Location> getAll() {
        return this.repository.getAll();
    }







}
