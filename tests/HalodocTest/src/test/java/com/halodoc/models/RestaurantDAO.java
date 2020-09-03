package com.halodoc.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Comparator;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RestaurantDAO{
    @JsonProperty("R")
    private RRestaurantDAO r;
    @JsonProperty("apikey")
    private String apikey;
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;
    @JsonProperty("location")
    private LocationRDAO location;
    @JsonProperty("switch_to_order_menu")
    private Integer switchToOrderMenu;
    @JsonProperty("cuisines")
    private String cuisines;
    @JsonProperty("timings")
    private String timings;
    @JsonProperty("average_cost_for_two")
    private Integer averageCostForTwo;
    @JsonProperty("price_range")
    private Integer priceRange;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("highlights")
    private List<String> highlights = null;
    @JsonProperty("offers")
    private List<Object> offers = null;
    @JsonProperty("opentable_support")
    private Integer opentableSupport;
    @JsonProperty("is_zomato_book_res")
    private Integer isZomatoBookRes;
    @JsonProperty("mezzo_provider")
    private String mezzoProvider;
    @JsonProperty("is_book_form_web_view")
    private Integer isBookFormWebView;
    @JsonProperty("book_form_web_view_url")
    private String bookFormWebViewUrl;
    @JsonProperty("book_again_url")
    private String bookAgainUrl;
    @JsonProperty("thumb")
    private String thumb;
    @JsonProperty("user_rating")
    private UserRatingDAO userRating;
    @JsonProperty("all_reviews_count")
    private Integer allReviewsCount;
    @JsonProperty("photos_url")
    private String photosUrl;
    @JsonProperty("photo_count")
    private Integer photoCount;
    @JsonProperty("menu_url")
    private String menuUrl;
    @JsonProperty("featured_image")
    private String featuredImage;
    @JsonProperty("has_online_delivery")
    private Integer hasOnlineDelivery;
    @JsonProperty("is_delivering_now")
    private Integer isDeliveringNow;
    @JsonProperty("store_type")
    private String storeType;
    @JsonProperty("include_bogo_offers")
    private Boolean includeBogoOffers;
    @JsonProperty("deeplink")
    private String deeplink;
    @JsonProperty("order_url")
    private String orderUrl;
    @JsonProperty("order_deeplink")
    private String orderDeeplink;
    @JsonProperty("is_table_reservation_supported")
    private Integer isTableReservationSupported;
    @JsonProperty("has_table_booking")
    private Integer hasTableBooking;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("phone_numbers")
    private String phoneNumbers;
    @JsonProperty("all_reviews")
    private AllReviewsDAO allReviews;
    @JsonProperty("establishment")
    private List<String> establishment = null;
    @JsonProperty("medio_provider")
    private Integer medioProvider;
    @JsonProperty("book_url")
    private String bookUrl;
}
