package com.example.client;

import com.example.model.AreaModel;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;

@Client("https://restapi.amap.com/v3/config/")
public interface AreaClient {

    @Get("/district")
    AreaModel district(@QueryValue String keywords, @QueryValue String subdistrict, @QueryValue String key);
}
