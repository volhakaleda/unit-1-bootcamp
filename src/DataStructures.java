import java.util.*;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

    public static void main(String args[]) {

//####1
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Jack"));
        cats.add(new Cat("Jane"));
        cats.add(new Cat("John"));
        cats.add(new Cat("Jessy"));
        cats.add(new Cat("Jackie"));

        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i).toString());
        }

//####2
        ArrayList<Integer> random = new ArrayList<>();
        random.add(100);
        random.add(200);
        random.add(200);
        random.add(200);
        random.add(200);
        random.add(1);
        random.add(4);
        random.add(1);

        mostFrequentElement(random);

//####3
        HashMap<String, Integer> accessCoders = new HashMap<>();

        accessCoders.put("Volha", 25);
        accessCoders.put("Murad", 20);
        accessCoders.put("Yoki", 20);
        accessCoders.put("Joanne", 20);
        accessCoders.put("Oleg", 20);
        accessCoders.put("Fransisco", 20);
        accessCoders.put("Naz", 20);


        Set<String> keys = accessCoders.keySet();
        for(String key : keys) {
            int value = accessCoders.get(key);
            System.out.println("Name " + key + " , " + "Age " + value);

        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        System.out.println(countClumps(list));


    }

    public static void mostFrequentElement(ArrayList<Integer> listOfNumbers) {

        Map<Integer, Integer> myMap = new HashMap<>();


        for (int i = 0; i < listOfNumbers.size(); i++) {
            int count = 1;

            int num = listOfNumbers.get(i);

            if(myMap.containsKey(num)) {
                count = myMap.get(num) + 1;
            }

            myMap.put(num, count);

        }

        ArrayList<Integer> values = new ArrayList<> (myMap.values());

        int max = 0;

        for (int j = 0; j < values.size(); j++) {

            if(values.get(j) > max) {
                max = values.get(j);
            }
        }
        Set<Integer> keys = myMap.keySet();
        for (Integer key: keys) {
            int value = myMap.get(key);
            if(max == value) {
                System.out.println("Element " + key + " , " + "Occurence " + max);
            }
        }
    }

    public static boolean canRentACar(HashMap<String, Integer> hashMap) {

        Set<String> keys = hashMap.keySet();
        for(String name : keys) {
            int age = hashMap.get(name);
            if (age >= 25) {
                return true;
            }
        }
        return false;
    }

    public static List<String> wordsWithoutList (String[] array, int i) {

        List<String> arrayOfStrings = new ArrayList<>();

        for(int j = 0; j < array.length; j++) {
            String s = array[j];
            if(s.length() != i) {
                arrayOfStrings.add(s);
            }
        }
        return arrayOfStrings;
    }

    public static int countClumps(List<Integer> list) {

        int clumpCount = 0;

        for(int i = 0; i < list.size(); i++) {

            int num1 = list.get(i);

            if(i+1 < list.size() && num1 == list.get(i+1)) {
                clumpCount++;

                while(i+2 < list.size() && list.get(i+1).equals(list.get(i+2))) {
                    i++;
                }
            }
        }
        return clumpCount;

    }


    public static List<String> printString(String s) {

        StringBuilder temp = new StringBuilder();
        List<String> listOfStrings = new ArrayList<>();


        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            }

            if (s.charAt(i) == ' ' || i == s.length()-1) {
                listOfStrings.add(temp.toString());
                temp.setLength(0);
            }

        }
        Collections.sort(listOfStrings);
        return listOfStrings;
    }
}
