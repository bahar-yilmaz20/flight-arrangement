package com.flight.arrangement.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class AirportsCreateRequestDTO {
    private Integer id;
    private String airportName;
    private String airportCode;
    private String countryCode;
    private String city;
    private Date createAt;
    private String createBy;
    private Date updateAt;
    private String updateBy;
}
