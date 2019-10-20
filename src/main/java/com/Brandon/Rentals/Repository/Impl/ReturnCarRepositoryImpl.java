package com.Brandon.Rentals.Repository.Impl;


import com.Brandon.Rentals.Domain.ReturnCar;
import com.Brandon.Rentals.Repository.ReturnCarRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("ReturnCarInMemory")
public class ReturnCarRepositoryImpl implements ReturnCarRepository {

    private static ReturnCarRepositoryImpl returnCarRepository = null;
    private Set<ReturnCar> returnCars;

    public ReturnCarRepositoryImpl(){
        returnCars = new HashSet<>();
    }

    public static ReturnCarRepositoryImpl getReturnCarRepository() {

        if(returnCarRepository == null){
            return new ReturnCarRepositoryImpl();
        }

        return returnCarRepository;
    }

    @Override
    public ReturnCar create(ReturnCar returnCar) {
        returnCars.add(returnCar);
        return returnCar;
    }

    @Override
    public ReturnCar read(String id) {

        return returnCars.stream().filter(returnCar -> returnCar.getRegNo().equals(id)).findAny().orElse(null);
    }

    @Override
    public ReturnCar update(ReturnCar returnCar) {

        ReturnCar inDB = read(returnCar.getRegNo());

        if(inDB != null){
            returnCars.remove(inDB);
            returnCars.add(returnCar);
            return returnCar;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        ReturnCar inDB = read(id);
        returnCars.remove(inDB);
    }

    @Override
    public Set<ReturnCar> getAll() {

        return returnCars;
    }

}
