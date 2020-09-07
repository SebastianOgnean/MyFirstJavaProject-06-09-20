public class Tema4 {
    public static void main(String[] args) {

        System.out.println("Media numerelor este: " + media(4,5,3));

    }

    public static int media(int primulNumar, int alDoileaNumar, int alTreileaNumar){

        int rezultat = (primulNumar + alDoileaNumar + alTreileaNumar)/3;

        return rezultat;

    }
}
