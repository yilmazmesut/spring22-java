public class D11_ForLoop01 {

    public static void main(String[] args) {

        // Type code to find the sum of integers from 10 to 14

        int sum = 0;

        for (int i = 10; i<15; i++){
            sum+=i;
        }
        System.out.println("The sum is " + sum);


        // Type code to find the multiplication of integers from 10 to 14

        int multi = 1;
        for (int i = 10; i<14; i++) {
            multi *= i;
        }
        System.out.println("The multiplication is " + multi);
    }
}
