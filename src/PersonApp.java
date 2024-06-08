public class PersonApp {
    public static void main(String[] args) {
        var person = new Person("Umam", "Sumenep");
        
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.countryId);

        person.sayHello("Budi");

        Person person2 = new Person("Budi", "Jakarta");
        Person person3;

        person3 = new Person("Joko", "Cirebon");

        person3.sayHello("Ahmad");

    }
}
