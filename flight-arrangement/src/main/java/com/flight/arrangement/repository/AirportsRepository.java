package com.flight.arrangement.repository;

import com.flight.arrangement.model.Airports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportsRepository extends JpaRepository<Airports, Integer> {

}
