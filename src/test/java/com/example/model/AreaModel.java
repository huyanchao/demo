package com.example.model;


import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class AreaModel {

    private String status;

    private String info;

    private String infoCode;

    private String count;

    private Object suggestion;

    private List<CountryModel> districts;
}
