package com.ssw.springbootdto.repository;

import com.ssw.springbootdto.entity.Passanger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository<Passanger,Integer> {
}
