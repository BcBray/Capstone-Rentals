package com.Brandon.Rentals.Service;


import com.Brandon.Rentals.Domain.ReturnCar;

import java.util.Set;

public interface ReturnCarService extends IService<ReturnCar,String> {

    Set<ReturnCar> getAll();

}