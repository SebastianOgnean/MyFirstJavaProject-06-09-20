public class Main {

    public static void main(String[] args) {

        System.out.println("Rezultatul adunarii este: " + adunare(12,6));
        System.out.println("Rezultatul scaderii este: " + scadere(12,6));
        System.out.println("Rezultatul inmultirii este: " + inmultire(12,6));
        System.out.println("Rezultatul impartirii este: " + impartire(12,6));

    }

    public static int adunare(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar + alDoileaNumar;

        return rezultat;

    }
    public static float scadere(float primulNumar, float alDoileaNumar){

        float rezultat = primulNumar - alDoileaNumar;

        return rezultat;

    }
    public static int inmultire(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar * alDoileaNumar;

        return rezultat;

    }
    public static int impartire(int primulNumar, int alDoileaNumar){

        int rezultat = primulNumar / alDoileaNumar;

        return rezultat;

    }

}