package com.flight.arrangement.repository;

import com.flight.arrangement.dtos.AirportsCreateRequestDTO;
import com.flight.arrangement.model.Airports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AirportsRepository extends JpaRepository<Airports, Integer> {

    Airports save(Airports airports);

    Optional<Airports> findById(Integer Id);

}
