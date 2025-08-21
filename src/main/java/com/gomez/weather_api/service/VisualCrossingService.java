package com.gomez.weather_api.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class VisualCrossingService {
    private static final Logger log = LoggerFactory.getLogger(VisualCrossingService.class);

    private final RestTemplate restTemplate;

    @Value("${visual.crossing.weather.api.url}")
    private String apiUrl;

    public VisualCrossingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getWeather() {
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
