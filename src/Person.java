public class Person {
    String name;
    String address;
    final String countryId = "Indonesia";

    Person(String paramName, String paramAddress) {
        name = paramName;
        address = paramAddress;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
        this(null);
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}
