import java.util.Arrays;

public class D13_Arrays01 {

    public static void main(String[] args) {

        // Type code to print the sum of the min and max value of an integer array:

        int arr[] = {23,12,34,10,78,19};

        // Put the elements in ascending order:
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));   // [10, 12, 19, 23, 34, 78]

        int minValue = arr[0];
        int maxValue = arr[arr.length-1];

        System.out.println(minValue + maxValue);    // 88

    }
}
