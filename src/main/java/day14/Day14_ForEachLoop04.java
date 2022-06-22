package day14;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Day14_ForEachLoop04 {

    public static void main(String[] args) {


        //// Find the longest word in a String
        String sentence = "Java is easy if you study. Actually nothing is easy if you do not study.";

        // Remove the punctuation marks.
        String sentenceWithoutPunctuation = sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentenceWithoutPunctuation);

        // Put every word in an array
        String words[] = sentenceWithoutPunctuation.split(" ");
        System.out.println(Arrays.toString(words));     //[Java, is, easy, if, you, study, Actually, nothing, is, easy, if, you, do, not, study]

        // Sort the array elements according to the lengths
        // Last element will be the longest one
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());
        System.out.println("The longest words is "  + words[0]);


        //// How to see all the longest elements if there are many?
        for (String w : words) {
            if (w.length()==words[0].length()) {
                System.out.println(w + " ");
            }
        }



    }
}
