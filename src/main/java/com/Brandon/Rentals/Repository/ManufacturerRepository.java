package com.Brandon.Rentals.Repository;



import com.Brandon.Rentals.Domain.Manufacturer;

import java.util.Set;

public interface ManufacturerRepository extends IRepository<Manufacturer, String> {

    Set<Manufacturer> getAll();

}
