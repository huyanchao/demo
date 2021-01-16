package com.example.model;

import lombok.Data;

import java.util.List;

@Data
public class CityModel {

    private String citycode;

    private String adcode;

    private String name;

    private String center;

    private String level;

    private List<DistrictModel> districts;
}
