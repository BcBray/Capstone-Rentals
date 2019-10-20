package com.Brandon.Rentals.Service;

import com.Brandon.Rentals.Domain.Vehicle;

import java.util.Set;

public interface VehicleService extends IService<Vehicle,String> {

    Set<Vehicle> getAll();
}
