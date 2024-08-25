package com.restaurant.rms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.rms.models.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Integer> {

}
