package com.Brandon.Rentals.Contoller;
/*
import com.Brandon.Rentals.Domain.ReturnCar;
import com.Brandon.Rentals.Service.Impl.ReturnCarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/returncar")
public class ReturnCarController {

    @Autowired
    private ReturnCarServiceImpl returnCarService;

    @PostMapping("/new")
    public ReturnCar create(@RequestBody ReturnCar returnCar){

        return returnCarService.create(returnCar);
    }

    @GetMapping(path = "/find/{id}")
    public ReturnCar findById(@PathVariable String id){

        ReturnCar customer = returnCarService.read(id);

        return customer;
    }


    @PutMapping("/update")
    public void update(@RequestBody ReturnCar returnCar){

        returnCarService.update(returnCar);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        returnCarService.delete(id);
    }

    @GetMapping("/getall")
    public Set<ReturnCar> getAll(){
        return returnCarService.getAll();
    }


}
*/