package com.example.spring_mysql_api.repository;

import com.example.spring_mysql_api.model.CityWeather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityWeatherRepository  extends JpaRepository<CityWeather, Long > {

     List<CityWeather> findByCityName(String cityName);

}
