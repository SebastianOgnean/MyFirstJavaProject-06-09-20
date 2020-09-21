package AnimalRescuer;

import java.sql.SQLOutput;

public class AppMain {
    public static void main(String[] args) {
        Dog myObject1 = new Dog();
        myObject1.setName("Jack");
        myObject1.setColor("Black");
        myObject1.setAge(2.8f);
        myObject1.setWeight(38.55f);
        //System.out.println(" Catelul meu se numeste - " + myObject1.getName() + " , este de culoare - " + myObject1.getColor() + ", in varsta de - " + myObject1.getAge() + " ani " + " si cantareste " + myObject1.getWeight() + " kilograme ");

        Adopter myObject2 = new Adopter();
        myObject2.setAdopterName("Mike");
        myObject2.setAge(26f);
        myObject2.setMoneyAmount(365f);
        //System.out.println(" Adoptatorul este - " + myObject2.getAdopterName() + " , are " + myObject2.getAge() + " ani " + " si suma de: " + myObject2.getMoneyAmount() + " $ ");

        Animal myObject3 = new Animal();
        myObject3.setAnimalName("Ghost");
        myObject3.setAnimalColor("grey");
        myObject3.setAnimalAge(10f);
        myObject3.setMoodLevel(100);
        myObject3.setFavoriteFood("goats");
        myObject3.setFavRecreationActivity("hunt");
        //System.out.println(" Animalul este - " + myObject3.getAnimalName() + " si are - " + myObject3.getAnimalAge() + " ani " + " si mananca " + myObject3.getFavoriteFood());

        AnimalFood myObject4 = new AnimalFood();
        myObject4.setAnimalFoodNameName("bones");
        myObject4.setQuantity(43);
        myObject4.setPrice(2f);
        //System.out.println(" Mancarea de animal este - " + myObject4.getAnimalFoodNameName() + " si costa - " + myObject4.getPrice() + " $ ");

        RecreationActivity myObject5 = new RecreationActivity();
        myObject5.setRecrActivNameName("sleep");
        //System.out.println(" Activitatea de recreere preferata este: " + myObject5.getRecrActivNameName());

        Vet myObject6 = new Vet();
        myObject6.setVetNameName("John");
        myObject6.setSpecialization("surgery");
        //System.out.println(" Veterinarul este - " + myObject6.getVetNameame() + " cu specializarea in - " + myObject6.getSpecialization());

        Cat myObject7 = new Cat();
        myObject7.setAnimalAge(4);
        myObject7.setAnimalColor("white");
        myObject7.setAnimalName("Lizzy.2");
        System.out.println(" Pisica este - " + myObject7.getAnimalName());


        Horse Calvin = new Horse();
        Calvin.setAnimalAge(12);
        Calvin.setAnimalColor("Blak");





    }

}


