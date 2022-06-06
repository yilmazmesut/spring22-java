public class D11_DoWhileLoop01 {

    public static void main(String[] args) {

        // Compare the given loops
        int i=1;

        while (i<1) {
            System.out.println("Hey I am while-loop");
            i++;
        }

        int k = 1;

        do {
            System.out.println("Hey, I am do-while-loop");
            k++;

        } while (k<1);


        // Note: Zero execution is possible in while-loop, but it is impossible in do-while-loop
        //       do-while-loop body is executed at least once

    }
}
