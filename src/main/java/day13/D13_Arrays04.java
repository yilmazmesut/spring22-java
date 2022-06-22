package day13;

public class D13_Arrays04 {

    public static void main(String[] args) {

        // Create an integer array and print all the elements less than 5:
        // [12, 3, -3, 5, 23] ==> 3, -3

        int arr[] = {12, 3, -3, 5, 23};

        // 1. Way: Use regular loops (for - while - do while)
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < 5) {
                System.out.print(arr[i] + ", ");
            }
            i++;
        }

        System.out.println("===============================");

        // 2.Way: Use for-each loop (Enhanced Loop) ==> (for-each loop can be used with arrays and collections
        for (int w : arr) {
            if (w < 5) {
                System.out.print(arr[w] + ", ");
            }
        }

        System.out.println("===============================");
        // 3.Way: for loop

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 5) {
                System.out.print(arr[j] + ", ");
            }
        }

        System.out.println("===============================");

        int k = 0;
        do {
            if (arr[k] < 5) {
                System.out.print(arr[k] + ", ");
            }
            k++;
        } while (k < arr.length);
    }
}
