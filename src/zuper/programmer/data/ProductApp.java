package zuper.programmer.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Toshiba L840 Core I3", 500_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}