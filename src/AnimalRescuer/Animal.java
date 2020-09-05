package AnimalRescuer;

public class Animal {
    String name = "Ghost";
    String color = "black";
    float age = 2.65f;
    float weight = 40f;
    int healthLevel = 10;
    int moodLevel = 5;
    String favoriteFood = "meat";
    String FavRecreationActivity = "sleep";

    public void run () {
        System.out.println("Is running with the pack");
    }
    public void sleep () {
        System.out.println("Is sleeping after a hunting");
    }
    public void eat () {
        System.out.println("Is eating some meat");
    }
}
