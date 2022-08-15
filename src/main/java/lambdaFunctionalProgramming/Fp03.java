package lambdaFunctionalProgramming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp03 {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        System.out.println(l);

        printInUppercase01(l);
        System.out.println();
        printElementsReversedSortedByLength(l);
        System.out.println();
        sortDistinctByLastCharacters(l);
        System.out.println();
        removeIfStartingWithAEndingWithN(l);
        System.out.println();
        removeIfLengthBetweenEightAndTenOrEndingWithO(l);

    }
    // 1) Create a method to print all list elements in uppercase

    // 1. Way:
    public static void printInUppercase01(List<String> list) {
        list.stream().map(String::toUpperCase).forEach(Utils::printTheSameLineWithSpace);
    }

    // 2. Way:
    public static void printInUppercase02(List<String> list) {
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }


    //2) Create a method to print the elements after ordering according to their lengths
    public static void printElementsSortedByLength(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils::printTheSameLineWithSpace);
    }

    // 3) Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printElementsReversedSortedByLength(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::printTheSameLineWithSpace);
    }

    //4) Create a method to sort the distinct elements by using their last characters
    public static void sortDistinctByLastCharacters(List<String> list) {
        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printTheSameLineWithSpace);
    }

    //// 5) create a method to sort the elements according to their lengths then according to their first character.
    public static void printSortedByLengthThenSortedByInitial(List<String> list) {
        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(Utils::printTheSameLineWithSpace);
    }

    // 6) remove the elements if the length of the element is greater than 5

    public static void removeIfTheLengthIsGreaterThanFive(List<String> list) {
        list.removeIf(t -> t.length() > 5);
        System.out.println(list);
    }

    // 7) remove the elements if the element is starting with 'A', 'a' or ending with 'N', 'n'
    public static void removeIfStartingWithAEndingWithN(List<String> list){
        list.removeIf(t-> t.toLowerCase().startsWith("a") || t.toLowerCase().endsWith("n"));
        System.out.println(list);

    }

    // 8) remove the elements if the length is between 8 and 10 or ending with 'o'
    public static void removeIfLengthBetweenEightAndTenOrEndingWithO(List<String> list) {

        // Atomic structure:

        Predicate<String> checkCondition = t-> (t.length()>7 && t.length()<11) || t.endsWith("o");

        list.removeIf(checkCondition);
        System.out.println(list);
    }



}
