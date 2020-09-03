package com.halodoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Collections;
import java.util.Comparator;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserRatingDAO implements Comparable<UserRatingDAO> {
    @JsonProperty("aggregate_rating")
    private String aggregateRating;
    @JsonProperty("rating_text")
    private String ratingText;
    @JsonProperty("rating_color")
    private String ratingColor;
    @JsonProperty("rating_obj")
    private RatingObjDAO ratingObj;
    @JsonProperty("votes")
    private Integer votes;

    public int compareTo(UserRatingDAO o1,UserRatingDAO o2){

        if(Double.valueOf(o1.aggregateRating)== Double.valueOf(o2.aggregateRating))
            return 0;
        else if(Double.valueOf(o1.aggregateRating)>Double.valueOf(o2.aggregateRating))
            return 1;
        else
            return -1;
    }

    public int compareTo(UserRatingDAO o) {
        if(Double.valueOf(o.aggregateRating)== Double.valueOf(getAggregateRating()))
            return 0;
        else if(Double.valueOf(o.aggregateRating)> Double.valueOf(getAggregateRating()))
            return 1;
        else
            return -1;

    }
}
