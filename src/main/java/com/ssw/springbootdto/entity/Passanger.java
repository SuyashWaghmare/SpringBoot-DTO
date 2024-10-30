package com.ssw.springbootdto.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Entity
@Data
public class Passanger extends BaseEntity {


    private String passengerName;
    private long mobileNumber;


    @OneToMany(cascade = CascadeType.ALL)
   // @JoinTable(name = "passenger_bookings", joinColumns = @JoinColumn(name = "passenger_id"), inverseJoinColumns = @JoinColumn(name = "booking_id"))
    private List<Bookings> bookings;


}
