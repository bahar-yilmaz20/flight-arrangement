package com.flight.arrangement.controller;

import com.flight.arrangement.dtos.AirportsCreateRequestDTO;
import com.flight.arrangement.service.AirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/airports")
public class AirportsController {

    @Autowired
    private AirportsService airportsService;

    @RequestMapping(value = "/create-airport", method = RequestMethod.POST)
    public ResponseEntity<Object> createAccount(
           @RequestBody AirportsCreateRequestDTO createAirportsCreateRequestDTO) {
        return ResponseEntity.ok(airportsService.createAirports(createAirportsCreateRequestDTO));
    }
}
