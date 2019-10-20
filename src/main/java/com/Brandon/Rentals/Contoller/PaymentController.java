package com.Brandon.Rentals.Contoller;

/*
import com.Brandon.Rentals.Domain.Payment;
import com.Brandon.Rentals.Service.Impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/payment")
public class PaymentController {


    @Autowired
    private PaymentServiceImpl paymentService;

    @PostMapping("/new")
    public Payment create(@RequestBody Payment payment){

        return paymentService.create(payment);
    }

    @GetMapping(path = "/find/{id}")
    public Payment findById(@PathVariable String id){

        Payment payment = paymentService.read(id);

        return payment;
    }


    @PutMapping("/update")
    public void update(@RequestBody Payment payment){

        paymentService.update(payment);

    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable String id){
        paymentService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Payment> getAll(){
        return paymentService.getAll();
    }


}
*/