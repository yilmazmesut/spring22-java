import java.util.Arrays;
import java.util.Scanner;

public class D13_Arrays02 {

    public static void main(String[] args) {

        // Create a String array by getting elements from user

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store in the array");
        int lenghtOfArr = input.nextInt();

        String arr[] = new String[lenghtOfArr];


        String str = input.nextLine();
        for (int i = 0; i < lenghtOfArr; i++) {
            System.out.println("Enter the " + (i+1) + ". element for array");
            arr[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(arr));


        // Type code to put elements in alphabetical order
        // sort() ==> puts the String elements in alphabetical order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Type code to print the total number of characters in the first and the last String
        int numOfInFirstElement = arr[0].length();
        int numOfInLastElement = arr[arr.length-1].length();
        System.out.println(numOfInFirstElement + numOfInLastElement);

    }
}
