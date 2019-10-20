package com.Brandon.Rentals.Repository;



import com.Brandon.Rentals.Domain.Rent;

import java.util.Set;

public interface RentRepository extends IRepository<Rent,String> {

    Set<Rent> getAll();

}