public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ahmad");
        employee.sayHello("Budi");

        employee = new Manager("Ahmad");
        employee.sayHello("Budi");

        employee = new VicePresident("Ahmad");
        employee.sayHello("Budi");

        sayHello(new Employee("Umam"));
        sayHello(new Manager("Mustafa"));
        sayHello(new VicePresident("Andi"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
