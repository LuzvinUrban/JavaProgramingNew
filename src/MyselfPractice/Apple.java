package MyselfPractice;

import java.util.Scanner;

public class Apple {
    /*
    String Practice 2
------------------------------------------------------------------------
[Remove first and last]
Given two words. Print the first word without its first character then
print the second word without its last character.
Input:
apple
banana
Output:
pple
banan
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = scan.next();
        System.out.println("Enter the second word");
        String word2 = scan.next();

        word1 = word1.substring(1);
        word2 =word2.substring(0, word2.length()-1);
        System.out.println(word1);
        System.out.println(word2);
    }
}
