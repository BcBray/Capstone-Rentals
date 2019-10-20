package com.Brandon.Rentals.Factory;


import com.Brandon.Rentals.Domain.Payment;

public class PaymentFactory {





    public static Payment getPayment(int customerId, int paymentId, String invoiceId){

        return new Payment.Builder()

                .customerId(customerId)

                .paymentId(paymentId)

                .invoiceId(invoiceId)

                .build();

    }



}