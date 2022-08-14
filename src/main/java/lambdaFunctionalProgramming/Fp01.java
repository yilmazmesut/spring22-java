package lambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp01 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(8, 9, 131, 10, 9, 10, 2, 8));

        System.out.println("1) Structured:");
        printElementsStructured(l);
        System.out.println("\n 1) Functional:");
        printElementsFunctional(l);

        System.out.println("\n2) Structured:");
        printTheEvenElementsStructured(l);
        System.out.println("\n 2) Functional:");
        printTheEvenElementsFunctional(l);

        System.out.println("\n 3) ");
        printSquareOfOddElements(l);

    }

    //// 1) create a method to print the list elements on the console in the same line with a space between two consecutive elements.
    // (Structured)
    public static void printElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    // create a method to print the list elements on the console in the same line with a space between two consecutive elements.
    // (Functional)
    public static void printElementsFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }


    //// 2) create a method to print the even list elements on the console in the same line with a space between two consecutive elements.
    // (Structured)
    public static void printTheEvenElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    // create a method to print the even list elements on the console in the same line with a space between two consecutive elements.
    // (Functional)
    public static void printTheEvenElementsFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println(t + " "));
    }

    //// 3) create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    // (Structured)
    public static void printSquareOfOddElements(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }


}