package com.restaurant.rms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.rms.models.Feedback;
import com.restaurant.rms.models.MenuItem;
import com.restaurant.rms.models.Reservation;
import com.restaurant.rms.service.FeedbackService;
import com.restaurant.rms.service.MenuService;
import com.restaurant.rms.service.ReservationService;

@RestController
@RequestMapping("/api")
public class CustomerController {
	

	    @Autowired
	    private MenuService menuService;

	    @Autowired
	    private ReservationService reservationService;

	    @Autowired
	    private FeedbackService feedbackService;

	    @GetMapping("/menu")
	    public List<MenuItem> getMenu() {
	        return menuService.getAllMenuItems();
	    }

	    @PostMapping("/reservations")
	    public Reservation makeReservation(@RequestBody Reservation reservation) {
	        return reservationService.makeReservation(reservation);
	    }

	    @PostMapping("/feedback")
	    public Feedback submitFeedback(@RequestBody Feedback feedback) {
	        return feedbackService.submitFeedback(feedback);
	    }
}
