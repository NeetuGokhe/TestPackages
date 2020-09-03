package com.halodoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RRestaurantDAO {

    @JsonProperty("has_menu_status")
    private HasMenuStatusDAO hasMenuStatus;
    @JsonProperty("res_id")
    private Integer resId;
    @JsonProperty("is_grocery_store")
    private Boolean isGroceryStore;
}
