package Day32_ArrayList;

import java.util.ArrayList;

public class PracticeFlow2Both {
    public static void main(String[] args) {
          /*
      Practice flow:

Create an ArrayList of Strings
add these elements:
    add Hat
    add Shoes
    add Jacket in middle of Hat and Shoes
    add Towel in the beginning
    add Car between Towel and Hat

Print the ArrayList after each action to see how the change is made

    */

        ArrayList<String> words = new ArrayList<>();
        words.add("Hat");
        System.out.println(words);
        words.add("Shoes");
        System.out.println(words);
        words.add(1, "Jacket");
        System.out.println(words);
        words.add(0, "Towel");
        System.out.println(words);
        words.add(1, "Car");
        System.out.println(words);

        /*

Practice flow:

Create an ArrayList of Strings
add these elements:
    Iron Man, Spider Man, Thor, Captain America, Hawkeye

    remove Thor by index

    remove Iron Man by element

    remove the first index

Print the ArrayList after each action to see how the change is made

       */

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");

        System.out.println(avengers);
        int indexOfThor = avengers.indexOf("Thor");
        System.out.println(indexOfThor);

        avengers.remove(indexOfThor); // remove(2) -> but more dynamic
        System.out.println(avengers);

        avengers.remove("Iron Man");
        System.out.println(avengers);

        avengers.remove(0);
        System.out.println(avengers);

        // removing in Integer ArrayList

    }
}


