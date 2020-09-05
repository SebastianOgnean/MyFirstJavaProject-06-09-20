package AnimalRescuer;

import java.sql.SQLOutput;

public class AppMain {
    public static void main(String[] args) {
    Dog jack = new Dog();
        System.out.println(jack.name);
        jack.run();
        jack.bark();
        jack.sleep();

        Animal ghost = new Animal();
        System.out.println(ghost.name);
        ghost.eat();
        ghost.run();
        ghost.sleep();

        Adopter mike = new Adopter();
        System.out.println(mike.name);
        mike.walk();
        mike.eat();

        AnimalFood bones = new AnimalFood();
        System.out.println(bones.name);
        bones.sell();

        RecreationActivity sleep = new RecreationActivity();
        System.out.println(sleep.name);
        sleep.nap();

        Vet john = new Vet();
        System.out.println(john.name);
        john.surgery();


    }

}


