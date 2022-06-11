import java.util.Arrays;
import java.util.Scanner;

public class D12_Arrays01 {

    public static void main(String[] args) {

        /*
            !) Arrays are for storing multiple data
            2) An array can have just a single data type
            3) Arrays can store just primitive data types or references of non-primitives
            When you put a String in an Array, java will put it in the heap memory, and put the references in the stack memory,
            so there is just reference of strings in Array.
                An array cannot have non-primitive data types.
           you can not put wrapper class into a wrapper class,
           4) When you create an Array, you have to declare its length (Number of elements in an Array)
         */

        // How to create an Array:
        int ages[] = new int[4];
        // How to print an Array on the console:
        System.out.println(Arrays.toString(ages));  // [0, 0, 0, 0]

        // How to assign values to array elements
        ages[0] = 12;
        ages[1] = 20;
        ages[2] = 11;
        ages[3] = 9;

        System.out.println(Arrays.toString(ages)); // [12, 20, 11, 9]

        // How to print Array elements one by one:
        System.out.println(ages[2]);    // 11

        // Print the sum of the ages Array elements on the console:
        System.out.println(ages[0] + ages[1] + ages[2] + ages[3]);  // 52

        // 2.Way:
        int sum = 0;
        for (int i = 0; i < ages.length; i++) {
            sum += ages[i];
        }
        System.out.println(sum);    // 52


        // How to create an Array and assign values in short way:
        String names[] = {"Tom", "Jim", "Alex", "Karl"};
        System.out.println(Arrays.toString(names));

        // Find total number of characters in Array elements:
        int total = 0;

        for (int i = 0; i < names.length; i++) {
            total += names[i].length();
        }
        System.out.println(total);  // 14



    }


}

