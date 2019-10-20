package com.Brandon.Rentals.Service.Impl;


import com.Brandon.Rentals.Domain.ReturnCar;
import com.Brandon.Rentals.Repository.Impl.ReturnCarRepositoryImpl;
import com.Brandon.Rentals.Repository.ReturnCarRepository;
import com.Brandon.Rentals.Service.ReturnCarService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ReturnCarServiceImpl")
public class ReturnCarServiceImpl implements ReturnCarService {

    private static ReturnCarServiceImpl service = null;
    private ReturnCarRepository repository;

    private ReturnCarServiceImpl() {
        this.repository = ReturnCarRepositoryImpl.getReturnCarRepository();
    }

    public static ReturnCarServiceImpl getService(){
        if (service == null) service = new ReturnCarServiceImpl();
        return service;
    }

    @Override
    public ReturnCar create(ReturnCar addCus) {
        return this.repository.create(addCus);
    }

    @Override
    public ReturnCar update(ReturnCar addCus) {
        return this.repository.update(addCus);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public ReturnCar read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<ReturnCar> getAll() {
        return this.repository.getAll();
    }




}
