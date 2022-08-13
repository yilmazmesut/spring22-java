package day28;

public class E01 {

    public static void main(String[] args) {
        divide(12, 0);  // .ArithmeticException

    }

    public static void divide(int a, int b) {

        try {
            System.out.println(a / b);

        } catch (ArithmeticException e) {

            System.out.println("A math rule was broken!!");
            System.err.println(e.getMessage());
            e.printStackTrace();    // gives you more info
        }

    }

}
