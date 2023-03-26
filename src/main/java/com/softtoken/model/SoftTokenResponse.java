package com.softtoken.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SoftTokenResponse {

    private String outCode;
    private String outMessage;
    private String softToken;
    private String email;
    private String name;
    private String qr;
    private String referenceNo;
}
