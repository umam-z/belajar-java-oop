package zuper.programmer.data;

import zuper.programmer.annotation.Fancy;

@Fancy(name = "Car", tags = {"Application", "Java"})
public interface Car extends HasBrand, IsMaintenance {
    void drive();
    int getTire();

    default boolean isBig() {
        return false;
    }
}
