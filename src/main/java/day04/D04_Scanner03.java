package day04;

import java.util.Scanner;

public class D04_Scanner03 {

    /*
        Ask user to enter the width, length and the height of a rectangular prism then find the volume.
        Volume = width * length * height
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = input.nextInt();
        System.out.println("Enter length: ");
        int length = input.nextInt();
        System.out.println("Enter height: ");
        int height = input.nextInt();

        System.out.println("Volume is : " + width * length * height);
    }
}
