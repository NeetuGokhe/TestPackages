package com.halodoc.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.halodoc.common.EntityMapper;
import com.halodoc.constants.BaseConstants;
import com.halodoc.constants.QueryContants;
import com.halodoc.models.*;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import static  org.testng.Assert.*;

import java.util.*;

import static io.restassured.RestAssured.given;

public class LocationHelper {

    public Response getLocationHelper(){
        Map<String,String> queryValue = new HashMap<String, String>();
        Map<String,String> headers = new HashMap<String, String>();
        headers.put(QueryContants.USER_KEY, QueryContants.USER_KEY_VALUE);
        queryValue.put(QueryContants.LOCATION_QUERY,QueryContants.USER_LOCATION);
        Response res = given().baseUri(BaseConstants.LOCATION).when().headers(headers).queryParams(queryValue).get().thenReturn();
        assertEquals(res.getStatusCode(), HttpStatus.SC_OK);
//        System.out.println(res.getBody().asString());
        return res;
    }

    public Response getLocationDetailsHelper() throws JsonProcessingException {
        Response getLocations = new LocationHelper().getLocationHelper();
        LocationDAO location =  (LocationDAO) new EntityMapper().getEntityObject(getLocations.getBody().asString(), LocationDAO.class);
        List<LocationSuggestionDAO> locationSuggestionDAO = location.getLocationSuggestions();
        Integer EntityId = locationSuggestionDAO.get(0).getEntityId();
        String EntityType = locationSuggestionDAO.get(0).getEntityType();
        Response locationDetails = getLocationDetails(EntityId,EntityType);
        assertNotEquals(locationDetails,null);
        return locationDetails;
    }

    public Response getLocationDetails(Integer entityId, String entityType) throws JsonProcessingException {
        Map<String,String> queryValues = new HashMap<String, String>();
        Map<String,String> headers = new HashMap<String, String>();

        headers.put(QueryContants.USER_KEY, QueryContants.USER_KEY_VALUE);
        queryValues.put(QueryContants.ENTITY_ID,String.valueOf(entityId));
        queryValues.put(QueryContants.ENTITY_TYPE, entityType);
        Response locationDetails = given().baseUri(BaseConstants.LOCATION_DETAILS).when().headers(headers).queryParams(queryValues).when().get().thenReturn();
//        System.out.println(locationDetails.getBody().asString());

        return locationDetails;
    }

    public List<BestRatedRestaurantDAO> getResturantInBudgetHelper(Response locationDetails) throws JsonProcessingException {
        List<BestRatedRestaurantDAO> rest = new ArrayList<BestRatedRestaurantDAO>();
        LocationDetailDAO  locationDetailDAO = (LocationDetailDAO) new EntityMapper().getEntityObject(locationDetails.getBody().asString(), LocationDetailDAO.class);
        List<BestRatedRestaurantDAO> bestRatedRestaurant = locationDetailDAO.getBestRatedRestaurant();
        List<UserRatingDAO> userlist = new ArrayList<UserRatingDAO>();
        for(int i=0;i<bestRatedRestaurant.size();i++){
            userlist.add(bestRatedRestaurant.get(i).getRestaurant().getUserRating());
        }
        Collections.sort(userlist);
        for(int j=0;j<5;j++){
            for(int i=0;i<bestRatedRestaurant.size();i++) {
                if(Double.valueOf(userlist.get(j).getAggregateRating()).equals(Double.valueOf(bestRatedRestaurant.get(i).getRestaurant().getUserRating().getAggregateRating()))) {
                    rest.add(bestRatedRestaurant.get(i));
                   break;
                }
            }
        }
        return rest;
    }


}
