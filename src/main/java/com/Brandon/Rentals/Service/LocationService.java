package com.Brandon.Rentals.Service;

import com.Brandon.Rentals.Domain.Location;

import java.util.Set;

public interface LocationService extends IService<Location,String> {

    Set<Location> getAll();

}
