package com.Brandon.Rentals.Factory;


import com.Brandon.Rentals.Domain.Models;

public class ModelsFactory {



    public static Models getModels(String suvId, String carId){

        return new Models.Builder()

                .suvId(suvId)

                .carId(carId)

                .build();

    }

}