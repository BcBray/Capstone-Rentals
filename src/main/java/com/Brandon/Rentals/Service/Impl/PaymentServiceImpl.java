package com.Brandon.Rentals.Service.Impl;


import com.Brandon.Rentals.Domain.Payment;
import com.Brandon.Rentals.Repository.Impl.PaymentRepositoryImpl;
import com.Brandon.Rentals.Repository.PaymentRepository;
import com.Brandon.Rentals.Service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("PaymentServiceImpl")
public class PaymentServiceImpl implements PaymentService {

    private static PaymentServiceImpl service = null;
    private PaymentRepository repository;

    private PaymentServiceImpl() {
        this.repository = PaymentRepositoryImpl.getPaymentRepository();
    }

    public static PaymentServiceImpl getService(){
        if (service == null) service = new PaymentServiceImpl();
        return service;
    }

    @Override
    public Payment create(Payment addCus) {
        return this.repository.create(addCus);
    }

    @Override
    public Payment update(Payment addCus) {
        return this.repository.update(addCus);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Payment read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Payment> getAll() {
        return this.repository.getAll();
    }





}
