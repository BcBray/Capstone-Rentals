package com.Brandon.Rentals.Service.Impl;


import com.Brandon.Rentals.Domain.Rent;
import com.Brandon.Rentals.Repository.Impl.RentRepositoryImpl;
import com.Brandon.Rentals.Repository.RentRepository;
import com.Brandon.Rentals.Service.RentService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("RentServiceImpl")
public class RentServiceImpl implements RentService {

    private static RentServiceImpl service = null;
    private RentRepository repository;

    private RentServiceImpl() {
        this.repository = RentRepositoryImpl.getRentRepository();
    }

    public static RentServiceImpl getService(){
        if (service == null) service = new RentServiceImpl();
        return service;
    }

    @Override
    public Rent create(Rent addCus) {
        return this.repository.create(addCus);
    }

    @Override
    public Rent update(Rent addCus) {
        return this.repository.update(addCus);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Rent read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Rent> getAll() {
        return this.repository.getAll();
    }





}