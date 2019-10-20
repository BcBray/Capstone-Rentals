package com.Brandon.Rentals.Contoller;
/*
import com.Brandon.Rentals.Domain.Vehicle;
import com.Brandon.Rentals.Service.Impl.VehicleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    private VehicleServiceImpl vehicleService;

    @PostMapping("/new")
    public Vehicle create(@RequestBody Vehicle vehicle){

        return vehicleService.create(vehicle);
    }

    @GetMapping(path = "/find/{id}")
    public Vehicle findById(@PathVariable String id){

        Vehicle vehicle = vehicleService.read(id);

        return vehicle;
    }


    @PutMapping("/update")
    public void update(@RequestBody Vehicle vehicle){

        vehicleService.update(vehicle);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        vehicleService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Vehicle> getAll(){
        return vehicleService.getAll();
    }




}
*/