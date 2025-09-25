package com.flight.arrangement.mapper;

import com.flight.arrangement.dtos.AirportsCreateRequestDTO;
import com.flight.arrangement.dtos.AirportsCreateResponseDTO;
import com.flight.arrangement.dtos.AirportsResponseDTO;
import com.flight.arrangement.model.Airports;
import com.flight.arrangement.model.Flights;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AirportsMapper {

    @BaseMapper
    @Mapping( target = "airportName", source = "airportName")
    @Mapping( target = "airportCode", source = "airportCode")
    @Mapping( target = "countryCode", source = "countryCode")
    @Mapping( target = "city", source = "city")
    public Airports toEntity(AirportsCreateRequestDTO airportsCreateRequestDTO);


    @Mapping( target = "airportName", source = "airportName")
    @Mapping( target = "airportCode", source = "airportCode")
    @Mapping( target = "countryCode", source = "countryCode")
    @Mapping( target = "city", source = "city")
    public AirportsCreateResponseDTO toDTO(Airports airports);

    @Mapping( target = "airportName", source = "airportName")
    @Mapping( target = "airportCode", source = "airportCode")
    @Mapping( target = "countryCode", source = "countryCode")
    @Mapping( target = "city", source = "city")
    public AirportsResponseDTO toDTOResponse(Airports airports);


    @Mapping( target = "airportName", source = "airportName")
    @Mapping( target = "airportCode", source = "airportCode")
    @Mapping( target = "countryCode", source = "countryCode")
    @Mapping( target = "city", source = "city")
    public List<AirportsResponseDTO> toDTOList(List<Airports> airports);
}
