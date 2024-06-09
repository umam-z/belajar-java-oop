public class Child extends Parent {
    String name;

    void doIt() {
        System.out.println("Do it in child");
        System.out.println("Parent name is " + super.name);
    }
}
