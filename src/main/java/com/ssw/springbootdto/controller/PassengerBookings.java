package com.ssw.springbootdto.controller;

import com.ssw.springbootdto.dto.PassengerBookingsDto;
import com.ssw.springbootdto.service.BookingsService;
import com.ssw.springbootdto.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passengerbookings-api")
public class PassengerBookings {

    @Autowired
    private PassengerService passengerService;

    @Autowired
    private BookingsService bookingsService;


    ResponseEntity<PassengerBookingsDto> bookTrain(@RequestBody PassengerBookingsDto passengerBookingsDto) {


       return new ResponseEntity<PassengerBookingsDto>(passengerService
               .bookTrain(passengerBookingsDto),HttpStatus.CREATED);
    }







}
