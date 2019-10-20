package com.Brandon.Rentals.Repository;


import com.Brandon.Rentals.Domain.Vehicle;

import java.util.Set;

public interface VehicleRepository extends IRepository<Vehicle, String> {

    Set<Vehicle> getAll();

}
