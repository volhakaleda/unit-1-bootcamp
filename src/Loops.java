import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

    public static void main(String args[]) {

        digits();
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers2() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
    }

    public static void printNumbers3(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbers4(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void printNumbers5() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printNumbers6(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printNumbers7() {
        int sum = 0;
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void printNumbers8(int n, String s) {
        if (n <= 0) {
            System.out.println("");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.println(s);
            }
        }
    }

    public static void printNumbers9(int n, String s) {
        if (n <= 0) {
            System.out.println("");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(s);
            }
        }
    }

    public static void printNumbers10() {
        int n = 10, t1 = 0, t2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(t1);


            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }

    public static void printNumbers11() {
        int fib1 = 0;
        int fib2 = 1;
        int total = 1;

        for (int i = 0; i < 8; i++) {

            int fibonacci = fib1 + fib2;
            total += fibonacci;

            fib1 = fib2;
            fib2 = fibonacci;
        }
        System.out.println(total);

    }

    public static void printNumbers12(int n) {
        int fib1 = 0;
        int fib2 = 1;
        int total = 1;

        for (int i = 0; i < n - 2; i++) {

            int fibonacci = fib1 + fib2;
            total += fibonacci;

            fib1 = fib2;
            fib2 = fibonacci;
        }
        System.out.println(total);

    }


    public static int sumNumbers(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                StringBuilder builder = new StringBuilder();
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    builder.append(str.charAt(i));
                    i++;
                }
                sum += Integer.parseInt(builder.toString());

            }
        }
        return sum;
    }

    public static String isNot(String s) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'i' && (i == 0 || i - 1 > 0 && !Character.isLetter(s.charAt(i - 1)))
                    && (i + 1 < s.length() || i + 1 < s.length() && s.charAt(i + 1) == 's' && (i + 2 < s.length() && !Character.isLetter(s.charAt(i + 2))))) {
                builder.append("is not ");
                i += 2;

            } else {

                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }

    public static String wordEnds(String str, String word) {

        StringBuilder b = new StringBuilder();

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == word.charAt(0)) {
                int count = 1;

                for (int x = 1; x < word.length(); x++) {
                    j++;
                    if (word.charAt(x) == str.charAt(j)) {
                        count++;
                    }
                }
                if (count == word.length()) {
                    if (j - word.length() > 0) {
                        char beginning = str.charAt(j - word.length());
                        b.append(beginning);
                    }

                    if (j + 1 < str.length()) {
                        char ending = str.charAt(j + 1);
                        b.append(ending);
                    }

                }
            }

        }
        return b.toString();
    }

    public static List<Integer> numberPuzzle() {

        List<Integer> list = new ArrayList<>();

        for(int i = 10; i <= 50; i++){
            for(int j = 50; j >= 10; j--){
                if(i+j == 60 && j-i == 14) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        return list;
    }

    public static void digits() {


        for(int i = 10; i <= 99; i++) {
            String s = String.valueOf(i);
            int sum = 0;

            for(int j = 0; j < s.length(); j++) {
                sum += s.charAt(j) - '0';
            }
            System.out.println(i + " " + sum);
        }
    }
}