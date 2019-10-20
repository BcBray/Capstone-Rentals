package com.Brandon.Test.Service;

import com.Brandon.Rentals.Domain.Payment;
import com.Brandon.Rentals.Factory.PaymentFactory;
import com.Brandon.Rentals.Service.Impl.PaymentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest

public class PaymentServiceImplTest {

    @Autowired
    private PaymentServiceImpl paymentService;

    Payment payment = PaymentFactory.getPayment( 11, 122,"tyt666");

    @Test
    public void create() {

        paymentService.create(payment);
        assertNotNull(paymentService.getAll());
        System.out.println(paymentService.getAll());
    }

    @Test
    public void read() {
        assertNotNull(paymentService.getAll());
        Payment payment1 = paymentService.read(payment.getInvoiceId());
        assertNotEquals(payment, payment1);
        System.out.println(paymentService.getAll());
    }

    @Test
    public void update() {

        assertNotNull(paymentService.getAll());

        Payment payment1 = PaymentFactory.getPayment(11, 122,"tyt666");
        payment1.setInvoiceId(payment.getInvoiceId());
        paymentService.update(payment1);

        Payment payment2 = paymentService.read(payment1.getInvoiceId());
        assertNotEquals(payment1, payment2);
        System.out.println(paymentService.getAll());
    }

    @Test
    public void delete() {

        assertNotNull(paymentService.getAll());
        paymentService.delete(payment.getInvoiceId());
        Payment notInSet = paymentService.read(payment.getInvoiceId());
        assertNull(notInSet);
        System.out.println(paymentService.getAll());
    }





}