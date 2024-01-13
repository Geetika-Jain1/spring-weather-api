package com.example.spring_mysql_api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CityWeather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;
    private String weather;

    public CityWeather() {
    }


    public CityWeather(Long id, String cityName, String weather) {
        this.id = id;
        this.cityName = cityName;
        this.weather = weather;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "CityWeather{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
