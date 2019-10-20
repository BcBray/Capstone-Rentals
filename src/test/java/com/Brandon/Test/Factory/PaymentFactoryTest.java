package com.Brandon.Test.Factory;

import com.Brandon.Rentals.Domain.Payment;
import com.Brandon.Rentals.Factory.PaymentFactory;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class PaymentFactoryTest {

    @Test
    public void getPayment() {

        int customerId = 123456789;
        int paymentId = 987456123;
        String invoiceId = "025";


        Payment p = PaymentFactory.getPayment(customerId,paymentId,invoiceId);
        System.out.println(p.getCustomerId());
        Assert.assertNotNull(p.getCustomerId());
    }


}