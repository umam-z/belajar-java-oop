package zuper.programmer.application;

import zuper.programmer.data.Animal;
import zuper.programmer.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Yoshss";
        animal.run();
    }
}
