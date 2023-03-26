package com.softtoken.service;

import com.softtoken.model.SoftTokenRequest;
import com.softtoken.model.SoftTokenResponse;

public interface SoftTokenService {

    public SoftTokenResponse save(SoftTokenRequest request);
}
