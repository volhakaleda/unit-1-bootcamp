import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

    private static Set<String> setATaleOfTwoCities;
    private static Set<String> setMobyDick;

    public static void main (String[] args) {

    countUniqueWordsATaleOfTwoCities();
    countUniqueWordsMobyDick();
    intersection();
    union();

  }

  public static void countUniqueWordsATaleOfTwoCities() {

      setATaleOfTwoCities = new HashSet();

      File file = new File("/Users/olgakoleda/Desktop/Java/unit-1-bootcamp/ATaleOfTwoCities");

      try{
          Scanner scanner = new Scanner(file);
          while(scanner.hasNext()) {

              String word = scanner.next();
              if(word.equals("The") || word.equals("The")) {
                  setATaleOfTwoCities.add(word.toLowerCase());
              }
              else{
                  setATaleOfTwoCities.add(word);
              }
          }
      }
      catch (FileNotFoundException e){
          e.printStackTrace();
      }
      System.out.println("Unique words in A Tale of Two Cities: " + setATaleOfTwoCities.size());

  }
    public static void countUniqueWordsMobyDick() {

        setMobyDick = new HashSet();

        File file = new File("/Users/olgakoleda/Desktop/Java/unit-1-bootcamp/MobyDick");

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()) {

                String word = scanner.next();
                if(word.equals("The") || word.equals("The")) {
                    setMobyDick.add(word.toLowerCase());
                }
                else{
                    setMobyDick.add(word);
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Unique words in Moby Dick: " + setMobyDick.size());

    }
    public static void intersection() {

      Set<String> cardinalitySet = new HashSet<>(setATaleOfTwoCities);

      cardinalitySet.retainAll(setMobyDick);
      int size = cardinalitySet.size();
      System.out.println("The size of a set that is the intersection of words " + size);
    }

    public static void union() {
        Set<String> unionSet = new HashSet<>(setATaleOfTwoCities);
        unionSet.addAll(setMobyDick);
        int size = unionSet.size();
        System.out.println("The size of a set that is the union of words is " + size);

        Iterator iterator = unionSet.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        }


}
