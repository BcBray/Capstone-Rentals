package com.Brandon.Rentals.Repository;



import com.Brandon.Rentals.Domain.Location;
import com.Brandon.Rentals.Repository.IRepository;

import java.util.Set;

public interface LocationRepository extends IRepository<Location, String> {

    Set<Location> getAll();



}
