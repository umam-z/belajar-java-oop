public class PersonApp {
    public static void main(String[] args) {
        var person = new Person();
        person.name = "Umam";
        person.address = "Sumenep";
        // person.countryId = "dfd"; # error
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.countryId);

        person.sayHello("Budi");

        Person person2 = new Person();
        Person person3;

        person3 = new Person();
        person3.name = "Joko";
        person3.sayHello("Budi");

    }
}
