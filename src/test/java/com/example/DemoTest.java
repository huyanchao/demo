package com.example;

import com.example.client.AreaClient;
import com.example.model.AreaModel;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
public class DemoTest {

    @Inject
    AreaClient areaClient;

    @Test
    void testItWorks() {
        String keywords = "中国";
        String subdistrict = "3";
        String key = "2ce5e29515cac0e67b0fd0faf00c3395";
        AreaModel district = areaClient.district(keywords, subdistrict, key);
        System.out.println(district.toString());
    }

}
