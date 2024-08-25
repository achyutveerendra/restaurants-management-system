package com.restaurant.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.rms.models.Reservation;
import com.restaurant.rms.repositories.ReservationRepo;

@Service
public class ReservationService {
	@Autowired
    private ReservationRepo reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation makeReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
