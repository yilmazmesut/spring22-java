import java.util.Scanner;

public class D05_Modulus {

    /*
        Modulus Operator:   % is called 'modulus operator' in Java
                            It returns the remainder in a division.
                            13/ 5 ==> Modulus operator gives you 3
                            13 % 5 ==> 3

     */

    public static void main(String[] args) {

        //// Ask user to enter an integer the print the last digit of the integer on the console;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();   // 1990
        int absN = Math.abs(n);     // We calculated absolute value. to some negative scenarios.
        int lastDigit = absN % 10;
        System.out.println("Last digit      : " + lastDigit);


        //// Ask user to enter his birth year, then print just last 2 digits on the console:
        int lastTwoDigits = absN % 100;
        System.out.println("Last 2 digit    : " + lastTwoDigits);

        //// Ask user to enter  an integer then check if the number is even(remainder is 0):
        if (absN % 2 == 0){
            System.out.println("This number is 'Even'");
        } else {
            System.out.println("This number is 'not Even'");
        }

        System.out.println("Is the number even? " + (absN % 2 == 0));


        //// Ask user to enter an integer, then check if the number is odd(remainder is 1):
        System.out.println("Is the number odd? " + (absN % 2 != 0));


        //// Ask user to enter a 3 digits integer the find the sum of the digits:
                                // input: 237
        int last = absN % 10;   // 7

        absN /= 10;             // 23
        int second = absN % 10; // 3

        absN /= 10;             // 2
        int first = absN % 10;

        System.out.println(last+second+first);



    }
}
