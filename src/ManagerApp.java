public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();

        manager.name = "Umam";
        manager.sayHello("Ahmad");

        var vp = new VicePresident();
        vp.name = "Joko";
        vp.sayHello("Mustafa");
    }
}
