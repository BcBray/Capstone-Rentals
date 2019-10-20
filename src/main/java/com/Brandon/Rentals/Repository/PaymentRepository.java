package com.Brandon.Rentals.Repository;



import com.Brandon.Rentals.Domain.Payment;

import java.util.Set;

public interface PaymentRepository extends IRepository<Payment, String> {

    Set<Payment> getAll();
}
