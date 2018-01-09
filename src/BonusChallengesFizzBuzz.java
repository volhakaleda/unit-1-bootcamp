
public class BonusChallengesFizzBuzz {

    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);


        fizzBuzz();
        cointainsThreeFive();
    }

    public static void fizzBuzz() {

        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void cointainsThreeFive() {

        for (int i = 1; i < 1000; i++) {

            if(String.valueOf(i).contains("3") && String.valueOf(i).contains("5")){
                System.out.println("Fizzbuzz");
            }
            else if(String.valueOf(i).contains("3")) {
                System.out.println("Fizz");
            }
            else if(String.valueOf(i).contains("5")) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}