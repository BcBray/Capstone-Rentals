package com.Brandon.Rentals.Repository.Impl;


import com.Brandon.Rentals.Domain.Location;
import com.Brandon.Rentals.Repository.LocationRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("LocationInMemory")
public class LocationRepositoryImpl implements LocationRepository {

    private static LocationRepositoryImpl locationRepository = null;
    private Set<Location> locations;

    public LocationRepositoryImpl(){
        locations = new HashSet<>();
    }

    public static LocationRepositoryImpl getLocationRepository() {

        if(locationRepository == null){
            return new LocationRepositoryImpl();
        }

        return locationRepository;
    }

    @Override
    public Location create(Location location) {
        locations.add(location);
        return location;
    }

    @Override
    public Location read(String id) {

        return locations.stream().filter(location -> location.getArea().equals(id)).findAny().orElse(null);
    }

    @Override
    public Location update(Location location) {

        Location inDB = read(location.getArea());

        if(inDB != null){
            locations.remove(inDB);
            locations.add(location);
            return location;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Location inDB = read(id);
        locations.remove(inDB);
    }

    @Override
    public Set<Location> getAll() {

        return locations;
    }

}
