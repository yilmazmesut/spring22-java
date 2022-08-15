package lambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(8, 9, 131, 10, 9, 10, 2, 8));

        System.out.println("1) Structured:=============");
        printElementsStructured(l);
        System.out.println("\n 1) Functional:");
        printElementsFunctional(l);

        System.out.println("\n2) Structured:============");
        printTheEvenElementsStructured(l);
        System.out.println("\n 2) Functional:");
        printTheEvenElementsFunctional(l);

        System.out.println("\n 3)============= ");
        printSquareOfOddElements(l);

        System.out.println("\n 4)==============");
        printCubeOfDistinctOddElements(l);

        printSumOfTheSquaresOfDistinctEvenElements(l);

        productOfCubesOfDistinctEvenElements(l);

        getMinElement(l);


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
        list.stream().forEach(t -> System.out.print(t + ", "));
    }


    //// 2) create a method to print the even list elements on the console in the same line with a space between two consecutive elements.
    // (Structured)
    public static void printTheEvenElementsStructured(List<Integer> list) {
        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + ", ");
            }
        }
    }

    // create a method to print the even list elements on the console in the same line with a space between two consecutive elements.
    // (Functional)
    public static void printTheEvenElementsFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + ", "));
    }

    //// 3) create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    // (Functional)
    public static void printSquareOfOddElements(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + ", "));
    }

    //// 4) create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
    // (Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).distinct().map(t -> t * t * t).forEach(t -> System.out.print(t + ", "));
    }

    //// 5) create a method to calculate the sum of the squares of distinct even elements.
    // (Functional)
    public static void printSumOfTheSquaresOfDistinctEvenElements(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }

    public static void printSumOfTheSquaresOfDistinctEvenElements2(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, Integer::sum);
        System.out.println(sum);
    }


    //// 6) create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {
        Integer product = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }

    //// 7) create a method to find the maximum value from the list elements
    // 1. Way
    public static void getMaxElement01(List<Integer> list) {
        Integer maxElement = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(maxElement);
    }

    //    2. Way
    public static void getMaxElement02(List<Integer> list) {
        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);
        System.out.println(max);
    }


    //// 8) create a method to find the minimum value from the list elements
    public static void getMinElement(List<Integer> list) {
        Integer min = list.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u) -> u);
        System.out.println(min);
    }

    //// 9) create a method to find the minimum value which is greater than 7 and even from the list
    // 1. Way:
    public static void getMinGreaterThanSevenAndEven01(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println(min);
    }

    // 2. Way:
    public static void getMinGreaterThanSevenAndEven02(List<Integer> list) {
        Integer min = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);

        System.out.println(min);
    }

        // 3. Way
        public static void getMinGreaterThanSevenAndEven03 (List < Integer > list) {
            Integer min = list.stream().filter(t->t%2==0).filter(t-> t>7).sorted().findFirst().get();
            System.out.println(min);
        }

        //// 10) create a method to find the half of the elements which are distinct and greater than 5 in reverse order on the list
        public static void halfOfElementsDistinctInReverse (List < Integer > list) {
            List<Double> result = list.
                                stream().
                                distinct().
                                filter(t-> t>5).
                                map(t->t/2.0).
                                sorted(Comparator.reverseOrder()).
                                collect(Collectors.toList());


        }


    }