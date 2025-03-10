package com.edgeopstech.tours_booking.service;

import com.edgeopstech.tours_booking.model.Tour;
import com.edgeopstech.tours_booking.repository.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {
    @Autowired
    private TourRepository repository;

    public List<Tour> getAllTours() {
        return repository.findAll();
    }

    public Tour getTourById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Tour addTour(Tour tour) {
        return repository.save(tour);
    }

    public void deleteTour(Long id) {
        repository.deleteById(id);
    }
}
