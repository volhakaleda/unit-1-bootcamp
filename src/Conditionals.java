/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

    public static void main(String args[]) {
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0) {
            return true;
        }
        return false;
    }

    public static boolean isMultuipleOfThree(int n) {
        if (n % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree(int n) {
        if (n % 2 != 0 && n % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isOddAndIsMultipleOfThree2(int n) {
        return isOdd(n) && isMultuipleOfThree(n);
    }

    public static void fizzMultipleofThree(int n) {
        if (n % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }

    public static boolean isFromLondon(Person person) {
        if (person.getCity().equals("London")) {
            return true;
        }
        return false;
    }

    public static void printName(Person person) {
        if (person.getName().length() >= 5) {
            System.out.println(person.getName());
        } else {
            System.out.println("Name is too short");
        }
    }

    public static boolean cigarParty(int n, boolean isWeekened) {
        if (n >= 40 && n <= 60 && !isWeekened) {
            return true;
        } else if (n >= 40 && isWeekened) {
            return true;
        } else {
            return false;
        }
    }

    public static int caughtSpeeding(int n, boolean isBirthday) {
        if (n <= 60 || (n <= 65 && isBirthday)) {
            return 0;
        } else if ((n >= 86 && isBirthday) || n >= 81) {
            return 2;
        } else {
            return 1;
        }
    }

    public static String alarmClock(int n, boolean isOnVacation) {

        if (n >= 1 && n <= 5 && !isOnVacation) {
            return "7:00";
        } else if (((n == 0 || n == 6) && !isOnVacation) || (isOnVacation && (n >= 1 && n <= 5))) {
            return "10:00";
        } else {
            return "off";
        }
    }

    public static int lotteryTicket(int a, int b, int c) {
        if (a == b && a == c) {
            return 20;
        } else if (a == b || a == c || b == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int blackJack(int a, int b) {

        if (a > 21 && b > 21) {
            return 0;
        } else if (a > 21) {
            return b;
        } else if (b > 21) {
            return a;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int temp;
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        if (c > b) {
            temp = b;
            b = c;
            c = temp;
        }
        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }
        return (a - b == b - c);
    }
}
