package selfPractice;

public class ShortHandOperators {
    public static void main(String[] args) {
        // Assignment
        int a =100;
        a =200; // assigns new value (200) to a

        System.out.println("---------------------------");
        //  addition Assignment
        int b = 200;
        b +=100; // increase the value by 100
        System.out.println(b);

        System.out.println("-------------------------");

        //Subtraction Assignment
        int c =200;
        c -=100; //decreases the value by 100
        System.out.println(c);

        System.out.println("--------------------------");
        // multiplication Assignment:
        int d =20;
        d *= 5;// multiplies the value by 4
        System.out.println(d);

        System.out.println("--------------------------");

        // Division Assignment :
        int e =20;
        e /= 4; // divides the value
        System.out.println(e);
        // remainder Assignment:

        System.out.println("--------------------------");
        int f = 200;
        f%=10; // remainder of 200 divided by 10
        System.out.println(f);


    }
}
