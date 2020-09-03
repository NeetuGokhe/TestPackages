package com.halodoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class LocationSuggestionDAO {
    @JsonProperty("entity_type")
    private String entityType;
    @JsonProperty("entity_id")
    private Integer entityId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("city_id")
    private Integer cityId;
    @JsonProperty("city_name")
    private String cityName;
    @JsonProperty("country_id")
    private Integer countryId;
    @JsonProperty("country_name")
    private String countryName;
}
