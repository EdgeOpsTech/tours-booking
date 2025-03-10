package com.edgeopstech.tours_booking.controller;

import com.edgeopstech.tours_booking.model.Tour;
import com.edgeopstech.tours_booking.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tours")
public class TourController {

    @Autowired
    private TourService service;

    @GetMapping
    public List<Tour> getAllTours() {
        return service.getAllTours();
    }

    @GetMapping("/{id}")
    public Tour getTour(@PathVariable Long id) {
        return service.getTourById(id);
    }

    @PostMapping
    public Tour addTour(@RequestBody Tour tour) {
        return service.addTour(tour);
    }

    @DeleteMapping("/{id}")
    public void deleteTour(@PathVariable Long id) {
        service.deleteTour(id);
    }
}
