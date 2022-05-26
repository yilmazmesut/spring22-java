import java.util.Scanner;

public class D05_IfStatement {

    /*
        If your score is less than 50, then you will fail
        id(Condition){
            <The code to be executed if the condition is  true>
        }
        if the condition is true, action will be executed.
        if the condition is false, action will not be executed

        Note: We use "if statement" to decide which code will be executed under which condition
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();

        ///// Type code to check if the integer got from user is divided by 3 or not:
        if (n%3==0) {
            System.out.println("The number is divided by 3");
        }
        if (n%3 !=0) {
            System.out.println("The number is not divided by 3");
        }


        //// Type code to check if the first digit of a 3 digits integer is less than 5
          // Is it is less than 5 print 'perfect number' otherwise print 'good number'

        if (n/100 < 5){
            System.out.println("Perfect Number");
        }
        if (n/100 >= 5){
            System.out.println("Good Number");
        }


        //// Ask user to enter the initial of the day names then print the day names on the console:
        System.out.println("Enter the initial of day day name");
        String s = input.next();

        if (s.equals("S")){
            System.out.println("Saturday and Sunday");
        }
        if (s.equals("T")){
            System.out.println("Tuesday and Thursday");
        }
        if (s.equals("W")){
            System.out.println("Wednesday");
        }
        if (s.equals("F")){
            System.out.println("Friday");
        }
        if (s.equals("M")){
            System.out.println("Monday");
        }

    }



}
