package day06_Operators;

public class LeapYear {

        //create a class LeapYear
        //
        //    declare and assign a year variable
        //    check if the year is a leap year, a year will be a leap year if it is divisible by 4

    public static void main(String[] args) {


        int year = 2000;
        boolean isLeapYear = year % 4 == 0;
        System.out.println("isLeapYear = " + isLeapYear);

        System.out.println( " A leap year is = " + isLeapYear);


    }

}
