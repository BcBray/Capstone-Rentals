package com.Brandon.Rentals.Service.Impl;

import com.Brandon.Rentals.Domain.Vehicle;
import com.Brandon.Rentals.Repository.Impl.VehicleRepositoryImpl;
import com.Brandon.Rentals.Repository.VehicleRepository;
import com.Brandon.Rentals.Service.VehicleService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("VerhicleServiceImpl")
public class VehicleServiceImpl implements VehicleService {

    private static VehicleServiceImpl service = null;
    private VehicleRepository repository;

    private VehicleServiceImpl() {
        this.repository = VehicleRepositoryImpl.getVehicleRepository();
    }

    public static VehicleServiceImpl getService(){
        if (service == null) service = new VehicleServiceImpl();
        return service;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        return this.repository.create(vehicle);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return this.repository.update(vehicle);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Vehicle read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Vehicle> getAll() {
        return this.repository.getAll();
    }



}
