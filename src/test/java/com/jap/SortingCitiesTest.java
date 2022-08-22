package com.jap;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortingCitiesTest {

    SortingCities sortingCities;

    @BeforeEach
    public void setUp() {
        sortingCities = new SortingCities();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    void shouldgivethenearestcity() {
        //arrange:
        int[] KiloMeter = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        String expectedresult = "Geneva";
        String[] cityname = new String[0];
        String actualresult = sortingCities.findnearestCity(KiloMeter, cityname);
    }

}