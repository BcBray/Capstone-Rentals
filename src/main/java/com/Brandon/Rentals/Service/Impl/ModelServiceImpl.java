package com.Brandon.Rentals.Service.Impl;

import com.Brandon.Rentals.Domain.Models;
import com.Brandon.Rentals.Repository.Impl.ModelsRepositoryImpl;
import com.Brandon.Rentals.Repository.ModelsRepository;
import com.Brandon.Rentals.Service.ModelService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service("ModelServiceImpl")
public class ModelServiceImpl implements ModelService {

    private static ModelServiceImpl service = null;
    private ModelsRepository repository;

    private ModelServiceImpl() {
        this.repository = ModelsRepositoryImpl.getModelsRepository();
    }

    public static ModelServiceImpl getService(){
        if (service == null) service = new ModelServiceImpl();
        return service;
    }

    @Override
    public Models create(Models addCus) {
        return this.repository.create(addCus);
    }

    @Override
    public Models update(Models addCus) {
        return this.repository.update(addCus);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Models read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<Models> getAll() {
        return this.repository.getAll();
    }





}
