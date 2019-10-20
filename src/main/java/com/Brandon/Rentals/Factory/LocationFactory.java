package com.Brandon.Rentals.Factory;


import com.Brandon.Rentals.Domain.Location;

public class LocationFactory {



    public static Location getLocation(String area, String areaCode){

        return new Location.Builder()

                .area(area)

                .areaCode(areaCode)

                .build();

    }

}