package com.ssw.springbootdto.service;

import com.ssw.springbootdto.dto.PassengerBookingsDto;
import com.ssw.springbootdto.dto.PassengerDto;

public interface PassengerService {


     PassengerDto registerPassenger(PassengerDto passengerDto);

    PassengerDto getPassenger(int id);

    PassengerBookingsDto bookTrain(PassengerBookingsDto passengerBookingsDto);
}
