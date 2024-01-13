package com.example.spring_mysql_api.service;


import com.example.spring_mysql_api.model.CityWeather;
import com.example.spring_mysql_api.repository.CityWeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private CityWeatherRepository repository;

    public CityWeather getWeatherByCity (String city) {
        return repository.findByCityName(city).get(0);

    }
}
