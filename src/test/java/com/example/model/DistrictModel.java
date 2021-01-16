package com.example.model;

import lombok.Data;

import java.util.List;

@Data
public class DistrictModel {

    private String citycode;

    private String adcode;

    private String name;

    private String center;

    private String level;

    private List<Object> districts;
}
