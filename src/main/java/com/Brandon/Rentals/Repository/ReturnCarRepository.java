package com.Brandon.Rentals.Repository;


import com.Brandon.Rentals.Domain.ReturnCar;

import java.util.Set;

public interface ReturnCarRepository extends IRepository<ReturnCar, String> {

    Set<ReturnCar> getAll();

}
