import java.util.Arrays;
import java.util.Scanner;

public class D08_StringManipulations01 {

    /*
        If your notes gives you correct output for some data, iut is not giving correct output for other data.
        It cannot  be accepted. That kind of codes are called "Hard Coding"

        If your code works for all data, it is called "Dynamic Code". Everytime you must make your code "Dynamic Code".
     */
    public static void main(String[] args) {

        //// Example 1: Count the alphabetical characters in a given String:
        // Tom12 Hanks!... ==> 8
        String name = "Tom12 Hanks!...     ";
        int numOfLetters = name.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters);


        //// Exapmle 2: Get the initials from full name. (Middle name is out of scope)
        // Tom Hanks ==> TH     -   tom hanks ==> TH    -       "    tOM Hanks    " ==> TH
        String fullName = "    tOM Hanks    ";

        // trim() ==> removes the spaces just from the beginning and from the and. It does not touch spaces in the middle.
        // substring(startingIndex, endingIndex) ==> method is used to get a specific part of a String.
        //startingIndex is inclusive, endingIndex is exclusive
        // Note 1: the variables used inside the method parenthesis are called "Parameters"
        // Note 2: the values you used inside the method parenthesis are called "Arguments"
        String initialOfFirstName = fullName.trim().substring(0,1).toUpperCase();

        // split() ==> method is used to split a String into specific parts by using a specific character or characters.
        String initialOfLastName = fullName.trim().split(" ")[1].substring(0,1).toUpperCase();

        System.out.println(initialOfFirstName + initialOfLastName);

        String x="Java is easy";
        System.out.println(Arrays.toString(x.split("a")));


        //// Example 3: Fic=x the day names format like "Sunday"
          // "sunday" ==> Sunday    -   "SUNDAY" ==> Sunday     -   "    sUNDAY    " ==> Sunday
        String dayName = "    sUNDAY    ";
        String initialOfDayName = dayName.trim().substring(0,1).toUpperCase();
        String otherCharsOfDayName = dayName.trim().substring(1).toLowerCase();
        System.out.println(initialOfDayName + otherCharsOfDayName);


        //// Example 4: Make the all digits last 4 digits of a credit card invisible by using '*'
          // 1234 1234 1234 1234    ==> **** **** **** 1234
        String creditCardNum = "1234 1234 1234 1234";
        String invisiblePart = creditCardNum.substring(0,15).replaceAll("\\S", "*");    // **** **** ****
        String visiblePart = creditCardNum.substring(15);
        System.out.println(invisiblePart + visiblePart);

        // Note: \\S ==> different from space
        //       \\s ==> just space character


        //// Example 5: Count how many characters different from space were used in a String:
          // "Tom Hanks was born in 1975."

        // 1.Way:
        String s = "Tom Hanks was born in 1975.";
        int numOfChars1 = s.replace(" ", "").length();
        System.out.println(numOfChars1);

        int numOfChars2 = s.replaceAll("\\s","").length();
        System.out.println(s.replace(" ", "").length());

//        2. Way
        int numOfCharacters = s.replace(" ", "").split("").length;

        //// Example 6:
        String str = "Java";
        System.out.println(str.replace("","/"));    //      /J/a/v/a/

        str.indexOf("x");  // -1
        // indexOf() ==> methods returns -1 for non-existing characters

    }
}
