package interview_preparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IQ3 {

    public static void main(String[] args) {
        System.out.println(removeDuplicatesFromString("Java is so simple programming language"));


        String word = "Java is so simple programming language";
        String result = "";
        List<String> duplicated = Arrays.asList(word.split(""));
        System.out.println(duplicated);
        List<String> withoutDuplicates = duplicated.stream().distinct().collect(Collectors.toList());
        System.out.println(withoutDuplicates);
        for (String each : withoutDuplicates) {
            result += each;
        }
        System.out.println(result);


    }

    public static String removeDuplicatesFromString(String word) {  //Java is so simple programming language
        String result = "";
        String memory = "";

        for (int i = 0; i < word.length(); i++) {
            String c = "" + word.charAt(i);

            if (!memory.contains(c)) {
                result += c;
            }
            memory += c;

        }
        return result;
    }

    //===========================


}
