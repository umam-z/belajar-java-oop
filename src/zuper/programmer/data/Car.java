package zuper.programmer.data;

public interface Car extends HasBrand, IsMaintenance {
    void drive();
    int getTire();

    default boolean isBig() {
        return false;
    }
}
