package com.halodoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class LocationDAO {

    @JsonProperty("location_suggestions")
    private List<LocationSuggestionDAO> locationSuggestions = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("has_more")
    private Integer hasMore;
    @JsonProperty("has_total")
    private Integer hasTotal;
    @JsonProperty("user_has_addresses")
    private Boolean userHasAddresses;

}
