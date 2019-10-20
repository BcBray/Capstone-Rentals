package com.Brandon.Rentals.Factory;

import com.Brandon.Rentals.Domain.Rent;

public class RentFactory {



    public static Rent getRent(String bookingId, int customerId) {

        return new Rent.Builder()

                .name(bookingId)

                .lastName(customerId)

                .build();

    }



}