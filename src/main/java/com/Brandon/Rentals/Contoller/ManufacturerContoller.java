package com.Brandon.Rentals.Contoller;

/*
import com.Brandon.Rentals.Domain.Manufacturer;
import com.Brandon.Rentals.Service.Impl.ManufacturerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/manufacturer")
public class ManufacturerContoller {

    @Autowired
    private ManufacturerServiceImpl manufacturerService;

    @PostMapping("/new")
    public Manufacturer create(@RequestBody Manufacturer manufacturer){

        return manufacturerService.create(manufacturer);
    }

    @GetMapping(path = "/find/{id}")
    public Manufacturer findById(@PathVariable String id){

        Manufacturer manufacturer = manufacturerService.read(id);

        return manufacturer;
    }


    @PutMapping("/update")
    public void update(@RequestBody Manufacturer manufacturer){

        manufacturerService.update(manufacturer);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        manufacturerService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Manufacturer> getAll(){
        return manufacturerService.getAll();
    }



}
*/