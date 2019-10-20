package com.Brandon.Rentals.Service;


import com.Brandon.Rentals.Domain.Rent;

import java.util.Set;

public interface RentService extends IService<Rent,String> {

    Set<Rent> getAll();

}
