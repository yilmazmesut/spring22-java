package day10;

import java.util.Scanner;

public class D10_ForLoop06 {

    public static void main(String[] args) {

        // Find the sum of the digits of decimal part in a double number
        // Ex: 23.1528 ==> 1+5+2+8=16

        double d = 23.1528;
        String sd = String.valueOf(d);  // 23.1528 (String)

        int indexOfDot = sd.indexOf(".") + 1;   // 2

        String decimalPart = sd.substring(indexOfDot);  // 1528 (String)

        // 2.Way:
//      String decimalpart = sd.split("\\.")[1];


        int decimalPartInt = Integer.parseInt(decimalPart); // 1528 (int)

        int sum = 0;

        for (int i = decimalPartInt; i > 0; i /= 10) {
            sum += i % 10;
        }
        System.out.println(sum);

//        ----------------------------------------
//        2. Way  :
//        for (int i = 1; i <= decimalPart.length(); i++) {
//            sum += decimalPartInt % 10;
//            decimalPartInt /= 10;
//        }
//        System.out.println(sum);
//        ----------------------------------------


        //// Example:
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int row = input.nextInt();
        int rowAbs = Math.abs(row);

        for (int i = rowAbs; i >= -rowAbs; i--) {
            System.out.print(i + " ");
        }
    }
}
