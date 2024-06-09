package zuper.programmer.application;

import zuper.programmer.data.Avanza;
import zuper.programmer.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
