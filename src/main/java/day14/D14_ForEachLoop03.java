package day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class D14_ForEachLoop03 {

    public static void main(String[] args) {

        // Check if the array elements are in the natural order.
        // "A", "B", "C" ==> true   -     "A", "C", "B"  ==> false
        // (first we should create a correct order array, after we can compare both)

        String arr[] = {"A", "C", "B"};

        // How to create a copy of the given array:

        // 1.Way: By using loops
//        String copyOfArr[] = new String[arr.length]; // [ null, null, null ]
//        int idx = 0;
//        for (String w : arr) {
//            copyOfArr[idx] = w;
//            idx++;
//        }
//        System.out.println(Arrays.toString(copyOfArr)); // [ A, C, B ]


        // 2.Way: By using existing copyOf() method
        String copyOfArr[] = Arrays.copyOf(arr, arr.length);

        Arrays.sort(copyOfArr);

        System.out.println(Arrays.toString(copyOfArr)); // [ A, B, C ]

        if (Arrays.equals(arr,copyOfArr)){
            System.out.println("Array elements are in he alphabetical order");
        } else {
            System.out.println("Arrays elements are not in alphabetical order");
        }


        // binarySearch() method in Array Class: It is used to check existence of an element in an array
        int brr[] = {12, 13, 5, 11, -2};

        // It is mandatory to be able to get meaningful response from binarySearch()
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));   // [-2, 5, 11, 12, 13]

        int response1 = Arrays.binarySearch(brr,13);   // I will get 4 for 14.
        System.out.println(response1);                      // binarySearch() returns the index, if the element exist
                                                            // so zero or positive integers mean the element exists in the array


        int response2 = Arrays.binarySearch(brr,14);    // I will get -6 for 14.   i) "-" means 14 does not exist
        System.out.println(response2);                       // "6" means if 14 would exist it would be the 6th element.


        // check if a specific element exist in an Array.
        // If the element exist, return the index of the element
        // If the element does not exist, return a message
        int crr[] ={ 13, 41, 2, 543 };

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to check i it exists or not :");

        int i = input.nextInt();
        Arrays.sort(crr);

        int response3 = Arrays.binarySearch(crr, i);
        if (response3<0){
            System.out.println("Element does not exist");
        } else {
            System.out.println("exist and index of element " + i + "is : " + response3);

        }








    }
}
