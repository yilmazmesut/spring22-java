package day10;

import java.util.Scanner;

public class D10_ForLoop03 {

    public static void main(String[] args) {

        //// Type code to print just unique characters in a String
        //   Alabama ==> Albm

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to see unique character");
        String uniques = input.nextLine();

        for (int i = 0; i < uniques.length(); i++) {

            char c = uniques.charAt(i);
            if (uniques.indexOf(c) == uniques.lastIndexOf(c)) {
                System.out.println(c);
            }
        }

        /*
        Type to print to following image on the console:
             X X X X X
             X X X X X
             X X X X X
         */

        System.out.println("Enter the number of columns: ");
        int columns = input.nextInt();
        System.out.println("Enter the number of rows: ");
        int row = input.nextInt();

        for (int i = 1; i <= row; i++) {
            String s = "";
            for (int j = 1; j <= columns; j++) {
                s += "X ";
            }
            System.out.println(s);
        }
    }
}
