package com.Brandon.Rentals.Contoller;
/*
import com.Brandon.Rentals.Domain.Rent;
import com.Brandon.Rentals.Service.Impl.RentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/rent")
public class RentController {

    @Autowired
    private RentServiceImpl rentService;

    @PostMapping("/new")
    public Rent create(@RequestBody Rent rent){

        return rentService.create(rent);
    }

    @GetMapping(path = "/find/{id}")
    public Rent findById(@PathVariable String id){

        Rent rent = rentService.read(id);

        return rent;
    }

    @PutMapping("/update")
    public void update(@RequestBody Rent rent){

        rentService.update(rent);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        rentService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Rent> getAll(){
        return rentService.getAll();
    }


}
*/