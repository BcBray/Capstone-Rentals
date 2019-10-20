package com.Brandon.Rentals.Factory;

import com.Brandon.Rentals.Domain.Vehicle;

public class VehicleFactory {



    public static Vehicle getVehicle(String regNo, int type)

    {

        return  new Vehicle.Builder()

                .regNo(regNo)

                .type(type)

                .build();

    }

}