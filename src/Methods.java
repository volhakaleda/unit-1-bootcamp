import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

    public static void main(String args[]) {

        System.out.println(calculateSquare(3));
        System.out.println(calculateSquareRoot(16));
        System.out.println(toLowerCase("Hello, World!"));
        System.out.println(isMultiple(2, 3));
        System.out.println(isMultiple(2, 4));
        System.out.println(isMultiple(5, 100));
        System.out.println(isMultiple(5, 101));
        prettyInteger(1);
        System.out.println(random(3, 10));
    }

    private static double calculateSquare(double a) {
        double result = a * a;
        return result;
    }

    private static double calculateSquareRoot(double a) {
        double result = Math.sqrt(a);
        return result;
    }

    private static String toLowerCase(String s) {
        String result = s.toLowerCase();
        return result;
    }

    private static boolean isMultiple(int a, int b) {
        return b % a == 0;
    }

    private static void prettyInteger(int a) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a*2 + 1; i++) {
            if(i == a) {
                result.append(a);
            } else {
                result.append('*');
            }
        }
        System.out.println(result.toString());
    }

    private static int random(int min, int max) {
        Random rn = new Random();
        int randomNum = rn.nextInt((max - min) + 1) + min;

        return randomNum;

    }
}
