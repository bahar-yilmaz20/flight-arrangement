package com.flight.arrangement.service;

import com.flight.arrangement.dtos.AirportsCreateRequestDTO;
import com.flight.arrangement.dtos.AirportsCreateResponseDTO;
import com.flight.arrangement.mapper.AirportsMapper;
import com.flight.arrangement.model.Airports;
import com.flight.arrangement.repository.AirportsRepository;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.boot.model.relational.Sequence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportsService {

    @Autowired
    private AirportsRepository airportsRepository;
    @Autowired
    private AirportsMapper airportsMapper;

    public AirportsCreateResponseDTO createAirports(AirportsCreateRequestDTO airportsCreateRequestDTO) {
        return airportsMapper.toDTO(airportsRepository.save(airportsMapper.toEntity(airportsCreateRequestDTO)));
    }

}
