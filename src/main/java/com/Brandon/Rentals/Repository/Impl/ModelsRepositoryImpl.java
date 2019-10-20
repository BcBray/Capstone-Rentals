package com.Brandon.Rentals.Repository.Impl;


import com.Brandon.Rentals.Domain.Models;
import com.Brandon.Rentals.Repository.ModelsRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("ModelsInMemory")
public class ModelsRepositoryImpl implements ModelsRepository {

    private static ModelsRepositoryImpl modelsRepository = null;
    private Set<Models> models;

    public ModelsRepositoryImpl(){
        models = new HashSet<>();
    }

    public static ModelsRepositoryImpl getModelsRepository() {

        if(modelsRepository == null){
            return new ModelsRepositoryImpl();
        }

        return modelsRepository;
    }

    @Override
    public Models create(Models mod) {
        models.add(mod);
        return mod;
    }

    @Override
    public Models read(String id) {

        return models.stream().filter(models -> models.getCarId().equals(id)).findAny().orElse(null);
    }

    @Override
    public Models update(Models mod) {

        Models inDB = read(mod.getCarId());

        if(inDB != null){
            models.remove(inDB);
            models.add(mod);
            return mod;
        }

        return null;
    }

    @Override
    public void delete(String id) {

        Models inDB = read(id);
        models.remove(inDB);
    }

    @Override
    public Set<Models> getAll() {

        return models;
    }
}
