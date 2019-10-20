package com.Brandon.Test.Repository;


//import com.sun.org.apache.xpath.internal.operations.Mod;
import com.Brandon.Rentals.Domain.Models;
import com.Brandon.Rentals.Factory.ModelsFactory;
import com.Brandon.Rentals.Repository.Impl.ModelsRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ModelsRepositoryImplTest
{
    @Autowired
    private ModelsRepositoryImpl modelsRepository;

    @Test
    public void create() {
        Models models = ModelsFactory.getModels( "ss", "Rover");
        modelsRepository.create(models);
        assertNotNull(modelsRepository.getAll());
    }

    @Test
    public void read() {
        Models models = ModelsFactory.getModels("ss", "Rover");
        modelsRepository.create(models);
        assertNotNull(modelsRepository.getAll());
        Models models1 = modelsRepository.read(models.getSuvId());
        assertNull(models1);
    }

    @Test
    public void update() {
        Models models = ModelsFactory.getModels( "sdf", "Ford");
        modelsRepository.create(models);
        assertNotNull(modelsRepository.getAll());

        Models models1 = ModelsFactory.getModels("sdf", "Ford");
        models1.setSuvId(models.getSuvId());
        modelsRepository.update(models1);
        Models models2 = modelsRepository.read(models.getSuvId());
        assertNotEquals(models1, models2);
    }

    @Test
    public void delete() {
        Models models = ModelsFactory.getModels("sdf", "Ford");
        modelsRepository.create(models);
        assertNotNull(modelsRepository.getAll());
        modelsRepository.delete(models.getSuvId());
        Models notInSet = modelsRepository.read(models.getSuvId());
        assertNull(notInSet);

    }

}