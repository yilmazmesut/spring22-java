import java.util.Scanner;

public class D06_IfElseStatement02 {

    public static void main(String[] args) {

        //// Ask user to enter the password then check if the passport is valid or not according to the given rules
        // 1)At least 8 characters     2)Contains at least 1 uppercase    3)Contains at least 1 lowercase    4)Contains aat least 1 symbol (different from letter and digits)

        // Note: [^A-Z] ==> different from uppercase's. (All characters except between A-Z)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = input.next();

        // 1. Way:
        if (password.length() < 8) {
            System.out.println("Password is invalid, because it does not have at lest 8 characters");

        } else if ((password.replaceAll("[^A-Z]","")).length() == 0) {
            System.out.println("Password is invalid because it does not have at least one uppercase");

        } else if ((password.replaceAll("[^a-z]","").length() == 0)) {
            System.out.println("Password is invalid because it does not have at least one lowercase");

        } else if ((password.replaceAll("[A-Za-z0-9]","")).length() == 0) {
            System.out.println("Password is invalid because it does not have at least one  symbol");

        } else{
            System.out.println("Valid password..");
        }

        System.out.println("===============================");

        // 2. Way:
        if (password.length() < 8) {
            System.out.println("Password is invalid, because it does not have at lest 8 characters");
        }
        if ((password.replaceAll("[^A-Z]","")).length() == 0) {
            System.out.println("Password is invalid because it does not have at least one uppercase");
        }
        if ((password.replaceAll("[^a-z]","").length() == 0)) {
            System.out.println("Password is invalid because it does not have at least one lowercase");
        }
        if ((password.replaceAll("[A-Za-z0-9]","")).length() == 0) {
            System.out.println("Password is invalid because it does not have at least one  symbol");
        }

    }
}
