package lambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(8, 9, 131, 10, 9, 10, 2, 8));

        printElementsFunctional(l);

    }

    // 1) create a method to print the list elements on the console in the same line with a space between two consecutive elements.
    // (Functional with method reference)
    public static void printElementsFunctional(List<Integer> list) {
        list.stream().forEach(Utils::printTheSameLineWithSpace);
    }

    // 2) create a method to print the even list elements on the console in the same line with a space between two consecutive elements.
    // (Functional with method reference)
    public static void printTheEvenElementsFunctional(List<Integer> list) {
        list.stream().filter(Utils::checkToBeEven).forEach(Utils::printTheSameLineWithSpace);
    }

    //// 3) create a method to print the square of odd list elements on the console in the same line with a space between two consecutive elements.
    // (Functional with method reference)
    public static void printSquareOfOddElements(List<Integer> list) {
        list.stream().filter(Utils::checkToBeOdd).map(Utils::getSquare).forEach(Utils::printTheSameLineWithSpace);
    }

    //// 4) create a method to print the cube of distinct odd list elements on the console in the same line with a space between two consecutive elements.
    // (Functional with method reference)
    public static void printCubeOfDistinctOddElements(List<Integer> list) {
        list.stream().distinct().filter(Utils::checkToBeOdd).map(Utils::getCube).forEach(Utils::printTheSameLineWithSpace);
    }

    //// 5) create a method to calculate the sum of the squares of distinct even elements.
    // (Functional with method reference)
    public static void printSumOfTheSquaresOfDistinctEvenElements01(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0, Math::addExact);
        System.out.println(sum);
    }

    public static void printSumOfTheSquaresOfDistinctEvenElements02(List<Integer> list) {
        Integer sum = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getSquare).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    //// 6) create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list) {
        Integer product = list.stream().distinct().filter(Utils::checkToBeEven).map(Utils::getCube).reduce(1, Math::multiplyExact);
    }

    //// 7) create a method to find the maximum value from the list elements
    public static void getMaxElement(List<Integer> list) {
        list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
    }

    //// 8) create a method to find the minimum value from the list elements

    //// 9) create a method to find the minimum value which is greater than 7 and even from the list
    public static void getMinGreaterThanSevenAndEven(List<Integer> list) {
        list.stream().distinct().filter(t -> t > 7).filter(Utils::checkToBeEven).reduce(Integer.MAX_VALUE, Math::min);
    }

    //// 10) create a method to find the half of the elements which are distinct and greater than 5 in reverse order on the list
    public static void halfOfElementsDistinctInReverse(List<Integer> list) {
        List<Double> result = list.stream().distinct().filter(t->t>5).map(Utils::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
    }

}
