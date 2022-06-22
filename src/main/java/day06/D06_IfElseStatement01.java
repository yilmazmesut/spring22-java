package day06;

import java.util.Scanner;

public class D06_IfElseStatement01 {

    /*
        If the score is less than 50 then you will fail
        If the score is greater than or equal 50 then you will pass

        If Else Condition:   If the score is less than 50    then you will fail      otherwise you will pass
                                    (condition)                 (Action 1)              (Action 2)

        Note: Just one of then will be executed
        Note: java looking for 'true condition', after finding 'true' java will stop execution.
        after this true java will not read next conditions

     */

    public static void main(String[] args) {

        //// Ask the user the score,if the score is less than 50, print "Fail" otherwise print "Pas" on the console
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = input.nextInt();

        if (score < 50) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }


        //// Ask user to enter the number of day, then print the name of the day whose number was given:
        // Example: 1-->Monday, 4-->Thursday
        System.out.println("Enter day number: ");
        int dayNum = input.nextInt();

        if (dayNum == 1) {
            System.out.println("Monday");
        } else if (dayNum == 2) {
            System.out.println("Tuesday");
        } else if (dayNum == 3) {
            System.out.println("Wednesday");
        } else if (dayNum == 4) {
            System.out.println("Thursdau");
        } else if (dayNum == 5) {
            System.out.println("Friday");
        } else if (dayNum == 6) {
            System.out.println("Saturday");
        } else if (dayNum == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please enter a valid day number");
        }


        ////

    }
}
