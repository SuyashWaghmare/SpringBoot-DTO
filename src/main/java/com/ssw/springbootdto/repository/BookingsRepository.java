package com.ssw.springbootdto.repository;

import com.ssw.springbootdto.entity.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings,Integer> {
}
