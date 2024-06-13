package zuper.programmer.application;

import zuper.programmer.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            
            public void sayHello() {
                System.out.println("Hi");
            }

            public void sayHello(String name) {
                System.out.println("Hi " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld() {
            
            public void sayHello() {
                System.out.println("Halo");
            }

            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("Umam");

        indonesia.sayHello();
        indonesia.sayHello("Umam");
    }
}
