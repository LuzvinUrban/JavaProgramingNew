package day25_ArraysFourthDay;

import java.util.Arrays;

public class BinarySearch_Array_B {
    public static void main(String[] args) {

        int[] arr = {6,23,100,240,2000};
        //           0  1  2   3   4


        int[] b = {6, 2, -1, 4, 20, -14};
        //      0 1   2  3  4    5
        System.out.println(Arrays.binarySearch(b, 4)); // randomly correct
        System.out.println(Arrays.binarySearch(b, 6));
        System.out.println(Arrays.binarySearch(b, -14));
        // binary search method does not work if the array is not sorted
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        System.out.println();
        System.out.println(Arrays.binarySearch(b, 4));
        System.out.println(Arrays.binarySearch(b, 6));
        System.out.println(Arrays.binarySearch(b, -14));
        System.out.println(Arrays.binarySearch(b, 0));

        System.out.println();
        String[] words = {"hello", "world", "zebra", "water"};
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.binarySearch(words, "hello"));
        System.out.println(Arrays.binarySearch(words, "World"));
        System.out.println(Arrays.binarySearch(words, "yellow"));

    }
}