package com.softtoken.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoftTokenRequest {
    private String email;
    private String organizationCode;
    private String tokenType;
}
