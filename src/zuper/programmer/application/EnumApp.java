package zuper.programmer.application;

import zuper.programmer.data.Customer;
import zuper.programmer.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("UMAM");
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("print level");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
