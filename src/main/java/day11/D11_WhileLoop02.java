package day11;

public class D11_WhileLoop02 {

    public static void main(String[] args) {

        // Type code to check if a given integer is palindrome or not:
        // Palindrome: 121 <==> 121     123321 <==> 123321

        int i = 1213443121;
        String iS = String.valueOf(i);

        int k = iS.length()-1;
        String reversed = "";

        while (k>=0) {
            reversed += iS.charAt(k);

            k--;
        }

        if (iS.equals(reversed)) {
            System.out.println(i + " is a palindrome");
        } else {
            System.out.println(i + " is not a palindrome!");
        }
    }
}
