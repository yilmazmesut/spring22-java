package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

    public static void main(String[] args) {

        // if you sure number of elements, use arrays. Arrays faster than Lists.
        // Arrays can contain just "primitives" and  references. you can not put non-primitive elements into arrays.

        // if your elements can be change, use Lists. Because it gives you flexibility.
        // You can store non-primitive elements into Lists

        /*
                1) Arrays are fixed in length which is not good. but Lists are flexible length
                2) Arrays can store just primitives and references but Lists store nin-primitives.
                You cannot store any primitives in Lists.
                3) Arrays is faster than Lists.
                4) Arrays use memory less than Lists. (it uses stack memory)
         */

        // How to create a List(ArrayList):
        // 1. Way: Mostly used
        List<Integer> al = new ArrayList<>();

        // 2. Way: not common
        ArrayList<Integer> cl = new ArrayList<>();

        // How to print a List on the console
        System.out.println(al); // [] --> empty list

        // How to add elements into a List:
        // add() --> puts the elements in insertion order
        al.add(12);
        al.add(21);
        al.add(5);
        System.out.println(al); // [12, 21, 5]

        // add() --> puts any element into any index
        al.add(2,99);
        System.out.println(al); // [12, 21, 99, 5]

        // How to get the number of elements in a List:
            // For lists to explain the number of elements us "size"
            al.size();  // 4

        // How to get a specific element from a list by using index:
        int el = al.get(3);
        System.out.println(el);


        }
}
