import java.util.Arrays;
import java.util.Comparator;

public class D14_ForEachLoop02 {

    public static void main(String[] args) {

        // Sort the array elements according to their lenghts.
        // ["Michael", "Ali", "Maria", Veli" ] ==>  "Ali", "Veli", "Maria", "Michael"
        String arr[] = {"Michael", "Ali", "Maria", "Veli"};
        System.out.println(Arrays.toString(arr));   // [Michael, Ali, Maria, Veli]

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));   // [Ali, Veli, Maria, Michael]


        // Sort the array elements according to their lengths in descending order.
        // ["Michael", "Ali", "Maria", Veli" ] ==>  "Michael", "Ali", "Veli", "Maria",

        String brr[] = {"Jackson", "Tom", "Maria", "Veli"};
        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));   // [Jackson, Maria, Veli, Tom]



    }
}
