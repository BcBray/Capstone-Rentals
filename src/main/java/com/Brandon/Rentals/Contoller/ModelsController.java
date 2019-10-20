package com.Brandon.Rentals.Contoller;
/*
import com.Brandon.Rentals.Domain.Models;
import com.Brandon.Rentals.Service.Impl.ModelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/models")
public class ModelsController {

    @Autowired
    private ModelServiceImpl modelService;

    @PostMapping("/new")
    public Models create(@RequestBody Models mod){

        return modelService.create(mod);
    }

    @GetMapping(path = "/find/{id}")
    public Models findById(@PathVariable String id){

        Models models = modelService.read(id);

        return models;
    }


    @PutMapping("/update")
    public void update(@RequestBody Models models){

        modelService.update(models);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        modelService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Models> getAll(){
        return modelService.getAll();
    }






}
*/