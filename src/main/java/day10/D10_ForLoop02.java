package day10;

import java.util.EnumSet;

public class D10_ForLoop02 {

    public static void main(String[] args) {

        // Interview question
        // Type code to reverse a String
        // Tom Hanks ==> sknaH moT

        String str = "Tom Hanks";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.print(reversed);

        System.out.println("=====================");

        //// Type code to find the sum of the digits of an integer
        // 2543 ==> 14
        int sumOfDigits = 0;

        for (int i = 2543; i > 0; i = i / 10) {
            sumOfDigits += i % 10;
        }
        System.out.println(sumOfDigits);


    }
}
