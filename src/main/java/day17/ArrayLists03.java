package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        /*
            Count the words in a String one by one
            String is "Ali came to school, and Ayse came to school."
            Ali=1, came=2, to=2, school=2, and=1, Ayse=1
        */

        String str = "Ali came to school, and Ayse came to school.";
        String strWithoutPunctiuation = str.replaceAll("\\p{Punct}","");

        String words[] = strWithoutPunctiuation.split(" ");

        List<String> wordsList = new ArrayList<>();
        for (String w : words) {
            wordsList.add(w);
        }
        // wordsList.addAll(Arrays.asList(words));
        System.out.println(Arrays.toString(words));

        String word = "";
        int counter = 1;

        for (int i = 0; i < wordsList.size(); i++) {
            word = wordsList.get(i);

            for (int k = i+1; k < wordsList.size() ; k++) {
                if (word.equals(wordsList.get(k))) {
                    counter++;
                    wordsList.remove(k);
                    k--;
                }
            }
            System.out.println(word + " = " + counter);
            counter = 1;
        }
    }
}
