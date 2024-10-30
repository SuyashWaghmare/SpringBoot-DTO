package com.ssw.springbootdto.serviceimpl;

import com.ssw.springbootdto.dto.PassengerBookingsDto;
import com.ssw.springbootdto.dto.PassengerDto;
import com.ssw.springbootdto.entity.Bookings;
import com.ssw.springbootdto.entity.Passanger;
import com.ssw.springbootdto.repository.BookingsRepository;
import com.ssw.springbootdto.repository.PassengerRepository;
import com.ssw.springbootdto.service.PassengerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassengerServiceimpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    @Autowired
    private BookingsRepository bookingsRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public PassengerDto registerPassenger(PassengerDto passengerDto) {

        // DTO to Entity
        Passanger passenger = modelMapper.map(passengerDto, Passanger.class);

        Passanger savedPassenger = passengerRepository.save(passenger);


        // After saving Entity, Converted to DTO again
        return modelMapper.map(savedPassenger, PassengerDto.class);
    }

    @Override
    public PassengerDto getPassenger(int id) {

        Passanger passanger = passengerRepository.findById(id).get();

        // Entity to DTO
        PassengerDto passengerDto = modelMapper.map(passanger, PassengerDto.class);


        return passengerDto;
    }

    @Override
    public PassengerBookingsDto bookTrain(PassengerBookingsDto passengerBookingsDto) {


        Bookings bookings = bookingsRepository.findById(passengerBookingsDto.getId()).get();
        Passanger passanger = passengerRepository.findById(passengerBookingsDto.getId()).get();



        return null;
    }
}
