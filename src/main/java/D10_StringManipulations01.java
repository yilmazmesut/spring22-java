import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class D10_StringManipulations01 {

    public static void main(String[] args) {

        /*
             Ask user to enter his full name, then create a unique id for the user
             Id should contain first 2 characters of the first name and last 2 characters of the last name
             use the current date time at the end of the ID
             Example; Tom Hanks ==> Toks20220528110434
         */

        // Note 1: Index of last character equals to length() - 1  everytime

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        String firstChars = name.substring(0, 2);
        String lastChars = name.substring(name.length()-2);

        LocalDateTime currentDateTime = LocalDateTime.now();
        String expectedCurrentDateTime = currentDateTime.toString().substring(0,19).replaceAll("[^0-9]","");
        System.out.println(firstChars + lastChars + expectedCurrentDateTime);

        // Date date = new Date();
        // long currentDate = date.getTime();
        // System.out.println(firstChars + lastChars + currentDate);


    }
}
