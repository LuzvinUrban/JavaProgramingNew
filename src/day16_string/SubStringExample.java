package day16_string;

public class SubStringExample {
    public static void main(String[] args) {

        String s = "infinity";
          //        01234567
        System.out.println(s.substring(0));
        System.out.println(s.substring(3));
        System.out.println(s.substring(5));
        System.out.println(s.substring(7));
      //  System.out.println(s.substring(9));//index 9 is invalid o stops the program

        System.out.println(s.substring(1,6));
        System.out.println(s.substring(0,1));//s.charAt
        System.out.println(s.substring(3,7));
        System.out.println(s.substring(3,8));
       // System.out.println(s.substring(3,9));// cannot use 8 index here
    }
}
