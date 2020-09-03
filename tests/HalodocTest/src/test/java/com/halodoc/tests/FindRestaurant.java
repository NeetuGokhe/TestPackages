package com.halodoc.tests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.halodoc.common.EntityMapper;
import com.halodoc.helpers.LocationHelper;
import com.halodoc.models.BestRatedRestaurantDAO;
import com.halodoc.models.UserRatingDAO;
import io.restassured.response.Response;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.util.List;

public class FindRestaurant {

    @Test
    public void getLocation(){
        Response locationResponse =  new LocationHelper().getLocationHelper();
        assertNotEquals(locationResponse.getBody().asString(), null);
    }

    @Test
    public void getLocationDetails() throws JsonProcessingException {
        Response locationDetails = new LocationHelper().getLocationDetailsHelper();
        assertNotEquals(locationDetails.getBody().asString(), null);
    }
    @Test
    public void getResturantInBudget() throws JsonProcessingException {
        Response getLocationDetails = new LocationHelper().getLocationDetailsHelper();
        ObjectMapper mapper = new ObjectMapper();
        List<BestRatedRestaurantDAO> resturantlist =  new LocationHelper().getResturantInBudgetHelper(getLocationDetails);
        for(int i=0;i<5;i++){
            String jsonString = mapper.writeValueAsString(resturantlist.get(i));
            System.out.println( i+1 +" -- "+jsonString);
        }
    }
}
