import java.util.Scanner;

public class D07_Switch04 {

    public static void main(String[] args) {

        //// Ask user to enter one of the +, -, *, /, % operations.
        // ASk user to enter two values then return the result of the operation:

        Scanner input = new Scanner(System.in);


        System.out.println("Enter two numbers: ");
        double m = input.nextDouble();
        double n = input.nextDouble();

        System.out.println("Enter one of the '+, -, *, /, %' operations: ");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(m + " + " + n + " = " + (m + n));
                break;
            case '-':
                System.out.println(m + " - " + n + " = " + (m - n));
                break;
            case '*':
                System.out.println(m + " * " + n + " = " + (m * n));
                break;
            case '/':
                System.out.println(m + " / " + n + " = " + (m / n));
                break;
            case '%':
                System.out.println(m + " % " + n + " = " + (m * n / 100));
                break;
            default:
                System.out.println("That operation is not defined..");
        }


        // Note 1: String, int, char can be used in switch statement
        // Note 2: boolean, long, float, double is cannot be used in switch


    }
}
