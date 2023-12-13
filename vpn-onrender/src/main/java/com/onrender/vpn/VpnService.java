package com.onrender.vpn;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class VpnService {

    public ResponseEntity getResponseFromUrl(gptDto dto) {
        // Set up the RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Set the request headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer your_access_token");

        // Set the request body
        String requestBody = "{\"key1\":\"value1\",\"key2\":\"value2\"}";

        // Create the HttpEntity with headers and body
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        // Send the POST request
        ResponseEntity<String> responseEntity = restTemplate.exchange(dto.url, HttpMethod.POST, requestEntity, String.class);

        // Get the response body and headers
        String responseBody = responseEntity.getBody();
        HttpHeaders responseHeaders = responseEntity.getHeaders();

        // Print the response
        System.out.println("Response Body: " + responseBody);
        System.out.println("Response Headers: " + responseHeaders);

        return responseEntity;
    }
}
