package day07;

import java.util.Scanner;

public class D07_Switch03 {

    public static void main(String[] args) {

        //// Ask user to enter a character,
        // if it is vowel, letter print "Vowel",
        // if it is not vowel, print "Not vowel",
        // if it is not letter, print "Enter a letter":

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not: ");
        char c = input.next().toLowerCase().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
                System.out.println("Not Vowel");
                break;
            default:
                System.out.println("Enter a letter, not the others..");
        }


    }
}
