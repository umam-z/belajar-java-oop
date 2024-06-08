public class PersonApp {
    public static void main(String[] args) {
        var person = new Person("Umam", "Sumenep");
        
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.countryId);

        person.sayHello("Budi");

        Person person2 = new Person("Budi");

        Person person3;

        person3 = new Person();

        person3.name = "Mustafa";
        person3.address = "Jakarta";

        person3.sayHello("Ahmad");

    }
}
