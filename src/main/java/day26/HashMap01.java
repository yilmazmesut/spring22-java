package day26;

import java.util.HashMap;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {

        HashMap<String, Integer> hMap = new HashMap<>();

        hMap.put("Tom Hanks",13);
        hMap.put("Brad Pitt",24);
        hMap.put("Angelina Julie",46);
        hMap.put("Cuneyt Arkin",85);
        hMap.put("Alex De Souza",33);

        Set<String> keys = hMap.keySet();

        for (String w: keys  ) {
            System.out.println(w + "!");
        }
    }
}
