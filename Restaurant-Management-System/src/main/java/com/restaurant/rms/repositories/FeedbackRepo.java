package com.restaurant.rms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restaurant.rms.models.Feedback;

public interface FeedbackRepo extends JpaRepository<Feedback, Long> {

}
