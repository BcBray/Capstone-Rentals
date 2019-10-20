package com.Brandon.Rentals.Service;

import com.Brandon.Rentals.Domain.Manufacturer;

import java.util.Set;

public interface ManufacturerService extends IService<Manufacturer,String> {

    Set<Manufacturer> getAll();

}
