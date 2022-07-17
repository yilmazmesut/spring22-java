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
        al.add(2, 99);
        System.out.println(al); // [12, 21, 99, 5]

        // How to get the number of elements in a List:
        // For lists to explain the number of elements us "size"
        al.size();  // 4

        // How to get a specific element from a list by using index:
        int el = al.get(3);
        System.out.println(el);

        // Create a list and add even integers between 13 and 51 in descending order

        List<Integer> bl = new ArrayList<>();

        for (int i = 52; i > 12; i--) {
            bl.add(i);
        }
        System.out.println(bl);

        // Then print the 7th element on the console:
        System.out.println(bl.get(6));

        // How to remove a specific element
        List<String> dl = new ArrayList<>();
        dl.add("A");
        dl.add("B");
        dl.add("C");
        dl.add("C");
        dl.add("E");
        System.out.println(dl); // [A, B, C, E]
        dl.remove("C");
        // If you have repeated elements, remove() method removes just the first one
        System.out.println(dl); // [A, B, E]

        // Create an Integer LIst
        List<Integer> fl = new ArrayList<>();
        fl.add(12);
        fl.add(21);
        fl.add(32);
        fl.add(45);
        System.out.println(fl);

        // Remove 21 from the list fl
        //1.way: to remove a specific integer element from a list use indexOf() inside the remove(). Dont write directly the int element.
        fl.remove(fl.indexOf(21));
        System.out.println(fl);
        //2.way: to removw a specific int element from a list a convert it to wrapper class
        fl.remove((Integer) 32);

        // Create a String list, add elements into it, then remove the elements end with "a" starts with "M"
        List<String> gl = new ArrayList<>();
        gl.add("Maria");
        gl.add("Mandalena");
        gl.add("Karenina");
        gl.add("Mexico");
        gl.add("Casablanca");

        System.out.println(gl); // [Maria, Mandalena, Karenina, Mexico, Casablanca]

        for (int i =0; i<gl.size(); i++) {
            if (gl.get(i).startsWith("M") && gl.get(i).endsWith("a")) {
                gl.remove(gl.get(i));
                i--;
            }
        }
        System.out.println(gl); // [Karenina, Mexico, Casablanca]


    }
}
