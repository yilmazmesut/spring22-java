import java.util.Scanner;

public class D09_StringManipulations02 {

    public static void main(String[] args) {

     /*
    Check if a password has the following conditions
        i)    It should not be empty
        ii)   It should not be just a single space
        iii)  It should not have spaces at the beginning and at the end
        iv)   'i' should be a character in the password and first occurrence of 'i' should be at index 4
        v)    'K' should be a character in the password and last occurrence of 'K' should be at index 5
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String pwd = input.nextLine();

        if(!pwd.isEmpty()) {    // pwd.length()==0
            System.out.println("Password is not empty");
        } else {
            System.out.println("Password is should not be empty");
        }
        if (pwd.isBlank()) {
            System.out.println("Password is not space");
        } else {
            System.out.println("Password is should not be space");
        }
        if (pwd.length()>0 && pwd.length() == pwd.trim().length()) {
            System.out.println("Passport has no space at the beginning and at the end");
        } else {
            System.out.println("Passport should not have spaces at the beginning and at the end");
        }
        if (pwd.indexOf("i")==4) {
            System.out.println("Pass has 'i' at index 4");
        }
        if (pwd.lastIndexOf("K")==5) {
        }
            System.out.println("Pass has 'K' at index 5");

    }
}
