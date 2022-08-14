package day28;

public class E05 {

    public static void main(String[] args) {

        String str = "I love Java";
        getCharacterFromStringByIndex(str, 4);  // v

        String st = "I love Java";
        getCharacterFromStringByIndex(st,12);   // StringIndexOutOfBoundsException

        String s = null;
        getCharacterFromStringByIndex(s,0); //

    }

    public static void getCharacterFromStringByIndex(String s, int idx) {

        try {
        System.out.println(s.charAt(idx));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Non-existing index was used in the String");
        } catch (RuntimeException e) {
            System.out.println("The other one..");
        }
    }

}
