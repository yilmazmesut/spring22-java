package day07;

import java.util.Scanner;

public class D07_Switch01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any month name:");
        String month = input.nextLine();

        //// Ask user to enter the mount name then print the month number:

        // 1. Way:
        if (month.equalsIgnoreCase("January")) {
            System.out.println(1);
        } else if (month.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (month.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (month.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (month.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (month.equalsIgnoreCase("June")) {
            System.out.println(6);
        } else if (month.equalsIgnoreCase("July")) {
            System.out.println(7);
        } else if (month.equalsIgnoreCase("August")) {
            System.out.println(8);
        } else if (month.equalsIgnoreCase("September")) {
            System.out.println(9);
        } else if (month.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (month.equalsIgnoreCase("November")) {
            System.out.println(11);
        } else if (month.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("Please enter a valid month name");
        }


        // 2. Way:
        switch (month.toLowerCase()) {
            case "january":
                System.out.println(1);
                break;             // Go outside the switch.
            case "february":
                System.out.println(2);
                break;
            case "march":
                System.out.println(3);
                break;
            case "april":
                System.out.println(4);
                break;
            case "may":
                System.out.println(5);
                break;
            case "june":
                System.out.println(6);
                break;
            case "july":
                System.out.println(7);
                break;
            case "august":
                System.out.println(8);
                break;
            case "september":
                System.out.println(9);
                break;
            case "october":
                System.out.println(10);
                break;
            case "november":
                System.out.println(11);
                break;
            case "december":
                System.out.println(12);
                break;
            default:            // it is like 'else'
                System.out.println("Please enter a valid month name");
        }



    }


}
