package com.flight.arrangement.repository;

import com.flight.arrangement.dtos.AirportsCreateRequestDTO;
import com.flight.arrangement.model.Airports;
import com.flight.arrangement.model.Flights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flights,Integer> {



}
