/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {

    Cat catGarfield = new Cat("Garfield");
    Cat catPinkPanther = new Cat("Pink Panther");
    Cat catCatwoman = new Cat("Catwoman");

    catGarfield.setFavoriteFood("Lasagna");
    catPinkPanther.setFavoriteFood("Pizza");
    catCatwoman.setFavoriteFood("Seafood");

    catGarfield.setAge(3);
    catPinkPanther.setAge(5);
    catCatwoman.setAge(8);

  }

  public static boolean isOlder(Cat cat1, Cat cat2) {
      return cat1.getAge() > cat2.getAge();

  }

  public static void makeBestFriends(Cat cat1, Cat cat2) {
      cat1.setFavoriteFood("Cake");
      cat2.setFavoriteFood("Cake");
  }
  public static Cat makeKitten(Cat cat1, Cat cat2) {
      Cat kitten = new Cat(cat1.getName() + cat2.getName());
      kitten.setAge(0);

      return kitten;
  }

  public static void adoption(Cat cat, Person person){
      if(cat.getName().equals("Catwoman")) {
          System.out.println("Catwoman will never be anyone's pet!");
      }
      else {
          cat.setOwner(person);
      }
  }

  public static boolean isFree(Cat cat) {
      return cat.getOwner() == null;
  }

  public static boolean isSibling(Cat cat1, Cat cat2) {
      return cat1.getOwner() == cat2.getOwner();
  }
}
