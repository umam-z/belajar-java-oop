public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Ahmad");
        employee.sayHello("Budi");

        employee = new Manager("Ahmad");
        employee.sayHello("Budi");

        employee = new VicePresident("Ahmad");
        employee.sayHello("Budi");

        sayHello(new Manager("Mustafa"));
        sayHello(new VicePresident("Andi"));
        sayHello(new Employee("Umam"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
            } else {
            System.out.println("Hello " + employee.name);
            
        }
    }
}
