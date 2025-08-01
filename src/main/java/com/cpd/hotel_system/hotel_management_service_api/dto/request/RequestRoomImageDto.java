package com.cpd.hotel_system.hotel_management_service_api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestRoomImageDto {
    private MultipartFile file;
    private String roomId;
}
