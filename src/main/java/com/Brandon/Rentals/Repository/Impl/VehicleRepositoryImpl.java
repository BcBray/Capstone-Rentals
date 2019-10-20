package com.Brandon.Rentals.Repository.Impl;


import com.Brandon.Rentals.Domain.Vehicle;
import com.Brandon.Rentals.Repository.VehicleRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("VehicleInMemory")
public class VehicleRepositoryImpl implements VehicleRepository {

    private static VehicleRepositoryImpl vehicleRepository = null;
    private Set<Vehicle> vehicles;

    public VehicleRepositoryImpl(){
        vehicles = new HashSet<>();
    }

    public static VehicleRepositoryImpl getVehicleRepository() {

        if(vehicleRepository == null){
            return new VehicleRepositoryImpl();
        }

        return vehicleRepository;
    }

    @Override
    public Vehicle create(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle read(String id) {

        return vehicles.stream().filter(vehicle -> vehicle.getRegNo().equals(id)).findAny().orElse(null);
    }

    @Override
    public Vehicle update(Vehicle vehicle) {

        Vehicle inDB = read(vehicle.getRegNo());

        if(inDB != null){
            vehicles.remove(inDB);
            vehicles.add(vehicle);
            return vehicle;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Vehicle inDB = read(id);
        vehicles.remove(inDB);
    }

    @Override
    public Set<Vehicle> getAll() {

        return vehicles;
    }
}
