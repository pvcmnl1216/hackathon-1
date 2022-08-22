package com.jap;

public class SortingCities {


    public static String[] City() {
        String[] cityName = {"Bern,", "Lucerne,", "Interlaken,", "Grindelwald,", "Engelberg,", "Geneva,", "Murren,", "Basel,", "Zermatt,", "Jungfraujoch." };
        for (int i = 0; i < cityName.length; i++) {
            System.out.println(cityName[i]);

        }
        return cityName;
    }

    public static int[] KiloMeter() {
        int[] distance = {138, 52, 118, 136, 85, 276, 103, 87, 214, 101};
        for (int i = 0; i < distance.length; i++) {
            System.out.println(distance[i]);
        }
        return distance;
    }

    public String upperCase(String[] cities) {
        String cityName = " ";
        for (int i = 0; i < cities.length; i++) {
            cityName += " ".concat(cities[i]).toUpperCase();
        }
        return cityName;
    }

    public String findnearestCity(int[] distance, String[] cities) {
        String cityName = " ";
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] == 52) {
                cityName = cities[i];
            }
        }
        return cityName;
    }

    public String finddistance(int[] distance, String[] cities) {
        String cityName = " ";
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] >= 270) {
                cityName = cities[i];
            }
        }
        return cityName;
    }

    public static void main(String[] args) {
        String[] cities = City();
        int[] distance = KiloMeter();
        SortingCities sortingCities = new SortingCities();
        String upperCase = sortingCities.upperCase(cities);
        System.out.println(upperCase);
        String city = sortingCities.findnearestCity(distance, cities);
        System.out.println("Nearest city from zurich = " + city);
        String CityDistance = sortingCities.finddistance(distance, cities);
        System.out.println("longest city from zurich = " + CityDistance);


    }
}