package day28;

public class E04 {

    public static void main(String[] args) {

        convertStringToIntegerThenDivideByGivenNumber("2314",2);

        convertStringToIntegerThenDivideByGivenNumber("1a",3);  // NumberFormatException (1. Exception)

        convertStringToIntegerThenDivideByGivenNumber("12",0);  // ArithmeticException (2. Exception)
    }

    public static void convertStringToIntegerThenDivideByGivenNumber(String s, int num) {

        try {
            System.out.println(Integer.parseInt(s) / num);

        } catch (NumberFormatException e) {
            System.out.println("Issue occurred in conversion");

        } catch (ArithmeticException e) {
            System.out.println("Issue occurred in division");
        }

    }
}
