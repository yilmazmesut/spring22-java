package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists02 {

    public static void main(String[] args) {

        /*
                From a given list find all pairs whose sum is a given number
                {4, 6, 5, -10, 8, 5, 20} ==> 10
                For example;  4+6=10, 5+5=10, -10+20=10
         */
        //To create a List, following syntax can be used but if you create the List
        //by using following syntax, you cannot use List methods change the size

        List<Integer> list = Arrays.asList(4, 6, 5, -10, 8, 5, 20);     // this is normally Array, but looks List. You cant list methods. you cant change the size it.
        System.out.println(list);

        //list.add(222);            //UnsupportedOperationException
        //list.clear();             //UnsupportedOperationException
        //list.remove((Integer)5);  //UnsupportedOperationException

        for (int i = 0; i < list.size(); i++) {

            for (int j = i+1; j < list.size(); j++) {

                if (list.get(i) + list.get(j) == 10) {
                    System.out.println(list.get(i) + " and " + list.get(j));
                }
            }
        }
    }
}
