package day27;

import java.util.*;

public class HashMap01_Question {

    public static void main(String[] args) {

        //Type code to find the number of occurrences of letters in a String
        String str = "toms are phantoms";
        str = str.replaceAll("[^a-zAZ]", "");
        System.out.println(str);

        String[] letters = str.split("");
        System.out.println(Arrays.toString(letters));

        Map<String, Integer> result = new HashMap<>();

        String container = "";

        for (String w : letters) {
            Integer numOfOccurrences = result.get(w);

            if (numOfOccurrences == null) {
                result.put(w, 1);
            } else {
                result.put(w, numOfOccurrences + 1);
            }

        }
        System.out.println(result);

    }
}
