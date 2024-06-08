public class Person {
    String name;
    String address;
    final String countryId = "Indonesia";

    Person(String name, String address) {
        name = name;
        address = address;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + name);
    }
}
