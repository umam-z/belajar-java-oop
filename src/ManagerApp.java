public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Umam");
        manager.sayHello("Ahmad");

        var vp = new VicePresident("Joko");
        vp.sayHello("Mustafa");
    }
}
