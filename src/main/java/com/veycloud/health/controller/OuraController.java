package com.veycloud.health.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class OuraController {

    @Value("${oura.api.base-url}")
    private String ouraApiBaseUrl;

    @Value("${oura.api.token}")
    private String token;

    private final RestTemplate restTemplate = new RestTemplate();

    // Fetch personal info
    @GetMapping("/oura/info")
    public ResponseEntity<String> getPersonalInfo() {
        String url = ouraApiBaseUrl + "/usercollection/personal_info";
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        // Make the API request

        // Return the API response
        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }
}