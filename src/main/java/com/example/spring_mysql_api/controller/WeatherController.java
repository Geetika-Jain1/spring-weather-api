package com.example.spring_mysql_api.controller;

import com.example.spring_mysql_api.model.CityWeather;
import com.example.spring_mysql_api.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public ResponseEntity<CityWeather> getWeather(@PathVariable String city) {
        CityWeather weather = weatherService.getWeatherByCity(city);
        if(weather == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(weather);
    }
}
