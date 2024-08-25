package com.restaurant.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurant.rms.models.Feedback;
import com.restaurant.rms.repositories.FeedbackRepo;

@Service
public class FeedbackService {
	@Autowired
    private FeedbackRepo feedbackRepository;

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    public Feedback submitFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
}
