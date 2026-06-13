package com.ashwinsi.auth_service.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SellerJwtData {
    private Integer id;
    private Boolean isAdmin;
}
