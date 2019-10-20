package com.Brandon.Rentals.Repository.Impl;


import com.Brandon.Rentals.Domain.Rent;
import com.Brandon.Rentals.Repository.RentRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("RentInMemory")
public class RentRepositoryImpl implements RentRepository {

    private static RentRepositoryImpl rentRepository = null;
    private Set<Rent> rents;

    public RentRepositoryImpl(){
        rents = new HashSet<>();
    }

    public static RentRepositoryImpl getRentRepository() {

        if(rentRepository == null){
            return new RentRepositoryImpl();
        }

        return rentRepository;
    }

    @Override
    public Rent create(Rent rent) {
        rents.add(rent);
        return rent;
    }

    @Override
    public Rent read(String id) {

        return rents.stream().filter(rent -> rent.getBookingId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Rent update(Rent rent) {

        Rent inDB = read(rent.getBookingId());

        if(inDB != null){
            rents.remove(inDB);
            rents.add(rent);
            return rent;
        }

        return null;
    }
    @Override
    public void delete(String id) {

        Rent inDB = read(id);
        rents.remove(inDB);
    }

    @Override
    public Set<Rent> getAll() {

        return rents;
    }

}
