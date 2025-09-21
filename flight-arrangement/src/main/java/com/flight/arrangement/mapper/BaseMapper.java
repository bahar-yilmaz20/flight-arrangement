package com.flight.arrangement.mapper;

import org.mapstruct.Mapping;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Mapping(target = "id", source = "id")
@Mapping(target = "createBy", source = "createBy")
@Mapping(target = "updateBy", source = "updateBy")
public @interface BaseMapper {

}
