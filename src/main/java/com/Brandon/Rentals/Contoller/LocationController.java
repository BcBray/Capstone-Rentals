package com.Brandon.Rentals.Contoller;

/*

import com.Brandon.Rentals.Domain.Location;
import com.Brandon.Rentals.Service.Impl.LocationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationServiceImpl locationService;

    @PostMapping("/new")
    public Location create(@RequestBody Location location){

        return locationService.create(location);
    }

    @GetMapping(path = "/find/{id}")
    public Location findById(@PathVariable String id){

        Location location = locationService.read(id);

        return location;
    }


    @PutMapping("/update")
    public void update(@RequestBody Location location){

        locationService.update(location);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        locationService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Location> getAll(){
        return locationService.getAll();
    }


}
*/