package zuper.programmer.application;

import zuper.programmer.annotation.Fancy;
import zuper.programmer.data.Animal;
import zuper.programmer.data.Cat;

@Fancy(name = "AnimalApp", tags = {"Application", "Java"})
public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "Yoshss";
        animal.run();
    }
}
