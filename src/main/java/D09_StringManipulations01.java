import java.util.Scanner;

public class D09_StringManipulations01 {

    public static void main(String[] args) {

    /*
        Example 1: Type code to print just the unique characters in a String:
                    "Hello" ==> Heo
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to print unique characters");

        String str = input.nextLine();

        char c = str.charAt(0);

         if ( str.indexOf(str.charAt(0)) == str.lastIndexOf(str.charAt(0)) ) {
             System.out.print(str.charAt(0));
         }
        if ( str.indexOf(str.charAt(1)) == str.lastIndexOf(str.charAt(1)) ) {
            System.out.print(str.charAt(1));
        }
        if ( str.indexOf(str.charAt(2)) == str.lastIndexOf(str.charAt(2)) ) {
            System.out.print(str.charAt(2));
        }
        if ( str.indexOf(str.charAt(3)) == str.lastIndexOf(str.charAt(3)) ) {
            System.out.print(str.charAt(3));
        }
        if ( str.indexOf(str.charAt(4)) == str.lastIndexOf(str.charAt(4)) ) {
            System.out.print(str.charAt(4));
        }

    }


}
