package day29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day29/TextFile01");

        int i = 0;

        while ((i=fis.read()) != -1) {
            System.out.print((char)i);
        }
    }
}
