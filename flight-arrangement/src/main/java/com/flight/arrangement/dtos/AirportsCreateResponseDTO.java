package com.flight.arrangement.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class AirportsCreateResponseDTO {
    private String airportName;
    private String airportCode;
    private String countryCode;
    private String city;
}
