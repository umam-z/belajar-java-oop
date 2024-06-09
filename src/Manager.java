public class Manager {
    String name;

    String company;

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    Manager(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }
}