package com.edgeopstech.tours_booking.repository;

import com.edgeopstech.tours_booking.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<Tour, Long> {
}
