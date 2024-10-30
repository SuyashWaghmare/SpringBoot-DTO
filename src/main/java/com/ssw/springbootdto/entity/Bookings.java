package com.ssw.springbootdto.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Bookings extends BaseEntity {


    private long prnNumber;
    private String trainName;
    private int trainNumber;

}
