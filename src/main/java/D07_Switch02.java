import java.util.Scanner;

public class D07_Switch02 {

    public static void main(String[] args) {

        //// Ask user to enter day number, than print all day names with starting with the given day name:
        // User ==> 5 Output ==> Friday - Saturday - Saturday
        // User ==> 3 Output ==> Wednesday - Thursday - Friday - Saturday - Sunday

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day number: ");
        int dayNumber = input.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter a valid day number..");
        }

    }
}
