package com.restaurant.rms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.rms.models.MenuItem;
import com.restaurant.rms.models.Reservation;
import com.restaurant.rms.service.MenuService;
import com.restaurant.rms.service.ReservationService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
    private MenuService menuService;

    @Autowired
    private ReservationService reservationService;

    @GetMapping("/reservations")
    public List<Reservation> getReservations() {
        return reservationService.getAllReservations();
    }

    @PostMapping("/menu")
    public MenuItem addMenuItem(@RequestBody MenuItem menuItem) {
        return menuService.addMenuItem(menuItem);
    }
}
