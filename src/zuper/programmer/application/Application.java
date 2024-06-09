package zuper.programmer.application;

import zuper.programmer.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Toshiba L840 Core I3", 500000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
