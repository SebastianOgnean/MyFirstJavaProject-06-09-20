import java.awt.desktop.SystemSleepListener;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("The sub is:" + sub(99,30,20, 9));
        System.out.println("The multiplie is:" + multiplie(45,3,23, 9));
        System.out.println("The divide is:" + divide(78,30,20, 9));
        System.out.println("The sum is:" + sum(199,30,20, 29));
    }

    static float sub(float first, float second, float third, float forth) {
        float result= first-second-third-forth;
        return result;
    }
    static float multiplie(float first, float second, float third, float forth) {
        float result = first - second - third - forth;
        return result;
    }
    static double divide(double first, double second, float third, float forth) {
        double result = first - second - third - forth;
        return result;
    }
    static int sum(int first, int second, int third, int forth) {
        int result = first - second - third - forth;
        return result;
    }
}

