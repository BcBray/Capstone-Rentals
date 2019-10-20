package com.Brandon.Test.Repository;

import com.Brandon.Rentals.Domain.Payment;
import com.Brandon.Rentals.Factory.PaymentFactory;
import com.Brandon.Rentals.Repository.Impl.PaymentRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentRepositoryImplTest {

    @Autowired
    private PaymentRepositoryImpl paymentRepository;

    @Test
    public void create() {
        Payment payment = PaymentFactory.getPayment( 11, 22,"jkj");
        paymentRepository.create(payment);
        assertNotNull(paymentRepository.getAll());
    }

    @Test
    public void read() {
        Payment payment = PaymentFactory.getPayment(11, 22,"jkj");
        paymentRepository.create(payment);
        assertNotNull(paymentRepository.getAll());
        Payment payment1 = paymentRepository.read(payment.getInvoiceId());
        assertNotNull(payment1);
    }

    @Test
    public void update() {
        Payment payment = PaymentFactory.getPayment( 111, 222,"jjjkj");
        paymentRepository.create(payment);

        assertNotNull(paymentRepository.getAll());

        Payment payment1 = PaymentFactory.getPayment(111, 222,"jjjkj");
        payment1.setCustomerId(payment.getCustomerId());
        paymentRepository.update(payment1);

        Payment payment2 = paymentRepository.read(payment.getInvoiceId());
        assertEquals(payment1, payment2);

    }

    @Test
    public void delete() {
        Payment payment = PaymentFactory.getPayment(111, 222,"jjjkj");
        paymentRepository.create(payment);
        assertNotNull(paymentRepository.getAll());
        paymentRepository.delete(payment.getInvoiceId());
        Payment notInSet = paymentRepository.read(payment.getInvoiceId());
        assertNull(notInSet);

    }



}