package com.cpd.hotel_system.hotel_management_service_api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseAddressDto {
    private String addressLine;
    private String city;
    private String country;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String branchId;
}
