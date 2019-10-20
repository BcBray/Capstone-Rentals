package com.Brandon.Rentals.Factory;

import com.Brandon.Rentals.Domain.Manufacturer;

public class ManufacturerFactory {



    public static Manufacturer getManufacturer(String vehicleId, String brand){

        return new Manufacturer.Builder()

                .vehicleId(vehicleId)

                .brand(brand)

                .build();

    }



}