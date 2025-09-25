package com.flight.arrangement.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Data
@Table(name="airports")
public class Airports {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "airport_name")
    private String airportName;
    @Column(name = "airports_code")
    private String airportCode;
    @Column(name = "country_code")
    private String countryCode;
    @Column(name = "city")
    private String city;
    @Column(name = "created_at")
    private Date createAt;
    @Column(name = "created_by")
    private String createBy;
    @Column(name = "updated_at")
    private Date updateAt;
    @Column(name = "updated_by")
    private String updateBy;
}
