package com.Brandon.Rentals.Service;
import com.Brandon.Rentals.Domain.Payment;

import java.util.Set;

public interface PaymentService extends IService<Payment,String> {

    Set<Payment> getAll();

}
