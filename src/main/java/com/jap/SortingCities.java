package com.jap;

public class SortingCities {

    public static String[] City() {
        String[] Cities = {"Bern,", "Lucerne,", "InterLaken,", "GrindelWald,", "EngelBerg,", "Geneva,", "Murren,", "Basel,", "Zermatt,", "JungFrauJoch" };

        return new String[0];
    }

    public static int[] Kilometers() {
        int[] Kms = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        return Kms;
    }

    public String uppercase(String[] Cities) {
        String cityName = "";
        for (int i = 0; i < Cities.length; i++) {
            cityName = "".concat(Cities[i].toUpperCase());
        }

        return cityName;
    }

    public String findnearestcity(String[] city) {
        String cityname = "";
        for (int i = 0; i < city.length; i++) {
            if (Kms[i] == 52) {
                cityname = city[i];
            }
        }
        return cityname;

    }

    public String findfarestcity(String[] city) {
        String cityname = "";
        for (int i = 0; i < city.length; i++) {
            if (Kms[i] >= 270) ;

        }
        return null;
    }

}
