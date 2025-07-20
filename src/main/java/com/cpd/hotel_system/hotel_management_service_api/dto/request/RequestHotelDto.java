package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestHotelDto {
    private String description;
    private String hotelName;
    private int starRating;
    private BigDecimal startingFrom;
}
