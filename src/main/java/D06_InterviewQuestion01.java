import java.util.Scanner;

public class D06_InterviewQuestion01 {
    public static void main(String[] args) {

        //// Ask user to enter 2 numbers then swap them
          // a=12 and b=13 ==> a=13 and b=12

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();

        // 1. Way:
        System.out.print("a= " + a);
        System.out.println(" b= " + b);

        int temp = 0;
        temp = b;
        b = a;
        a = temp;

        System.out.print("a= " + a);
        System.out.println(" b= " + b);

        // 2. Way:
        a = a + b;
        b= a - b;
        a = a - b;

        System.out.print("a= " + a);
        System.out.println(" b= " + b);
    }
}
