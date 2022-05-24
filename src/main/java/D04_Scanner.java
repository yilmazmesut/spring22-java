import java.util.Scanner;

public class D04_Scanner {

    /*
        Scanner Class is used to interact with user.
        To interact with the user b using scanner Class follow the steps:
        1) Create a Scanner Class object
        2) Give a message to the user
        3) Put the data coming from user into memory
        4)

     */

    public static void main(String[] args) {

        // 1) Create a Scanner Class object
        Scanner input = new Scanner(System.in);
        // class name   +   object name = new keyword  +  constructor(hey java put all data that coming from user!);

        // 2) Give a message to the user:
        System.out.println("Enter your age: ");

        // 3) Put the data coming from user into memory
        int age = input.nextInt();
    }
}
