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
public class LocationDetailDAO {
    @JsonProperty("popularity")
    private String popularity;
    @JsonProperty("nightlife_index")
    private String nightlifeIndex;
    @JsonProperty("nearby_res")
    private List<String> nearbyRes = null;
    @JsonProperty("top_cuisines")
    private List<String> topCuisines = null;
    @JsonProperty("popularity_res")
    private String popularityRes;
    @JsonProperty("nightlife_res")
    private String nightlifeRes;
    @JsonProperty("subzone")
    private String subzone;
    @JsonProperty("subzone_id")
    private Integer subzoneId;
    @JsonProperty("city")
    private String city;
    @JsonProperty("location")
    private RestaurantLocationDAO location;
    @JsonProperty("num_restaurant")
    private Integer numRestaurant;
    @JsonProperty("best_rated_restaurant")
    private List<BestRatedRestaurantDAO> bestRatedRestaurant = null;
    @JsonProperty("experts")
    private List<ExpertDAO> experts = null;
}
