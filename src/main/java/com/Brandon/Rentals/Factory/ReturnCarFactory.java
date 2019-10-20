package com.Brandon.Rentals.Factory;

import com.Brandon.Rentals.Domain.ReturnCar;

public class ReturnCarFactory {



    public static ReturnCar getReturnCar(String regNo, int customerId, double pay) {

        return new ReturnCar.Builder()

                .regNo(regNo)

                .customerId(customerId)

                .pay(pay)

                .build();

    }

}