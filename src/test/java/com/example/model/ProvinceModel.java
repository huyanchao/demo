package com.example.model;

import lombok.Data;

import java.util.List;

@Data
public class ProvinceModel {

    private List<String> citycode;

    private String adcode;

    private String name;

    private String center;

    private String level;

    private List<CityModel> districts;
}
