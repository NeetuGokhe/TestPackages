package com.halodoc.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserDAO {
    @JsonProperty("name")
    private String name;
    @JsonProperty("zomato_handle")
    private String zomatoHandle;
    @JsonProperty("foodie_color")
    private String foodieColor;
    @JsonProperty("profile_url")
    private String profileUrl;
    @JsonProperty("profile_image")
    private String profileImage;
    @JsonProperty("profile_deeplink")
    private String profileDeeplink;
}
