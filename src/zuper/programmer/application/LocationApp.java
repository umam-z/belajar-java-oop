package zuper.programmer.application;

import zuper.programmer.data.City;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); #error

        var city = new City();
        city.name = "Sumenep";
        System.out.println(city.name);
    }
}