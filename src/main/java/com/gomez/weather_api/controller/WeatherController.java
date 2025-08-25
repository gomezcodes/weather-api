package com.gomez.weather_api.controller;

import com.gomez.weather_api.service.VisualCrossingService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/weather")
public class WeatherController {

    private final VisualCrossingService visualCrossingService;

    public WeatherController(VisualCrossingService visualCrossingService) {
        this.visualCrossingService = visualCrossingService;
    }

    @GetMapping(value = "/{zipCode}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getWeather(@PathVariable String zipCode) {
        return visualCrossingService.getWeather(zipCode);
    }
}
