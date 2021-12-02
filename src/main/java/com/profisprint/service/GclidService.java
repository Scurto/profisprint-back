package com.profisprint.service;

public interface GclidService {

    String getGclid();
    String getRedirectUrl();
    String getQuery(String redirectUrl);
}
