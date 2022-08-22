package com.jap;

public class SortingCities {

    public static String[] City() {

        return new String[]{"Bern,", "Lucerne,", "InterLaken,", "GrindelWald,", "EngelBerg,", "Geneva,", "Murren,", "Basel,", "Zermatt,", "JungFrauJoch"};
    }

    public static int[] Kilometers() {
        return new int[]{138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
    }

    public static String uppercase(String[] Cities) {
        StringBuilder cityName = new StringBuilder();
        for (String city : Cities) {
            cityName.append("".concat(city).toUpperCase());
        }

        return cityName.toString();
    }

    public static String findnearestcity(int[] distance, String[] cities) {
        String cityname = "";
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == 52) {
                cityname = cities[i];
            }
        }
        return cityname;

    }

    public static String findfarestcity(int[] distance, String[] cities) {
        String cityName = "";
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] >= 270) {
                cityName = cities[i];
            }

        }
        return cityName;
    }

    public static void main(String[] args) {
        String[] cities = City();
        int[] distance = Kilometers();
        String upperCase = uppercase(cities);
        System.out.println(upperCase);
        String city = findnearestcity(distance, cities);
        System.out.println("Nearest city from zurich = " + city);
        String CityDistance = findfarestcity(distance, cities);
        System.out.println("longest city from zurich = " + CityDistance);


    }
}
