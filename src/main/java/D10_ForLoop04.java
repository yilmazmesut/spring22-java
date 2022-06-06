public class D10_ForLoop04 {

    public static void main(String[] args) {

         /* Print the following structure on the console
            Week: 1
              Day: 1
              Day: 2
              Day: 3

            Week: 2
              Day: 1
              Day: 2
              Day: 3
         */

        int weeks = 4;
        int day = 7;

        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j <= day; j++) {
                System.out.println("  Day: " + j);
            }
        }
    }
}
