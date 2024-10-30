package com.ssw.springbootdto.dto;

import com.ssw.springbootdto.entity.BaseEntity;
import com.ssw.springbootdto.entity.Bookings;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class PassengerBookingsDto extends BaseEntity {


    private String passengerName;
    private String mobileNumber;

    @OneToMany
    private List<BookingsDto> bookings;

//    private String prnNumber;
//    private String trainName;
//    private String trainNumber;


}
