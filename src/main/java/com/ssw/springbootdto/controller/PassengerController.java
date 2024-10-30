package com.ssw.springbootdto.controller;

import com.ssw.springbootdto.dto.PassengerDto;
import com.ssw.springbootdto.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger-api")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    

    @PostMapping("/registerPassenger")
    ResponseEntity<PassengerDto> registerPassenger(@RequestBody PassengerDto passengerDto) {


        return new ResponseEntity<PassengerDto>(passengerService.registerPassenger(passengerDto), HttpStatus.CREATED);
    }


    @GetMapping("/getPassenger/{id}")
    ResponseEntity<PassengerDto> getPassenger(@PathVariable int id) {

        return new ResponseEntity<>(passengerService.getPassenger(id),HttpStatus.OK);
    }


}

