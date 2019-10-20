package com.Brandon.Rentals.Repository.Impl;


import com.Brandon.Rentals.Domain.Payment;
import com.Brandon.Rentals.Repository.PaymentRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("PaymentInMemory")
public class PaymentRepositoryImpl implements PaymentRepository {

    private static PaymentRepositoryImpl paymentRepository = null;
    private Set<Payment> payments;

    public PaymentRepositoryImpl(){
        payments = new HashSet<>();
    }

    public static PaymentRepositoryImpl getPaymentRepository() {

        if(paymentRepository == null){
            return new PaymentRepositoryImpl();
        }

        return paymentRepository;
    }

    @Override
    public Payment create(Payment payment) {
        payments.add(payment);
        return payment;
    }

    @Override
    public Payment read(String id) {

        return payments.stream().filter(payment -> payment.getInvoiceId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Payment update(Payment payment) {

        Payment inDB = read(payment.getInvoiceId());

        if(inDB != null){
            payments.remove(inDB);
            payments.add(payment);
            return payment;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Payment inDB = read(id);
        payments.remove(inDB);
    }

    @Override
    public Set<Payment> getAll() {

        return payments;
    }
}
