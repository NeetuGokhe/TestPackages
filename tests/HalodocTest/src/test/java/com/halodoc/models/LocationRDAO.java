package com.halodoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class LocationRDAO {
    @JsonProperty("address")
    private String address;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("city")
    private String city;
    @JsonProperty("city_id")
    private Integer cityId;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("zipcode")
    private String zipcode;
    @JsonProperty("country_id")
    private Integer countryId;
    @JsonProperty("locality_verbose")
    private String localityVerbose;
}
