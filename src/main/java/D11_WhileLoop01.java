public class D11_WhileLoop01 {

    public static void main(String[] args) {

    // Type code to print the integers divisible by 4 and 6 from 13 to 211

        // 1. Way:
        for (int i = 13; i < 212 ; i++) {
            if (i%4==0 && i%6==0) {
                System.out.print(i + " ");
            }
        }

        // 2. Wat: By using while-loop: (more readable)
        int i=13;

        while (i<212) {
            if (i%4==0 && i%6==0) {
                System.out.print(i + " ");
            }
            i++;
        }

        // Type code to print integers from 3 to 5 by using while loop:
        int j = 3;

        while (j<6) {
            System.out.println(j + " ");

            j++;
        }




    }



}
