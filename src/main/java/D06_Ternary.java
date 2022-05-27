public class D06_Ternary {

    public static void main(String[] args) {

        // Ternary does the same with if-else by using different syntax.

        //// Type code to check if a number positive or not

        // 1. Way: By using if-else
        int x = 12;
        if (x > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Not positive");
        }

        // 2. Way: By using ternary
        String result = x > 0 ? "Positive" : "Not Positive";
        System.out.println(result);


        //// Type code to check if an integer has 3 digits or not
        int y = 234;
        int absY = Math.abs(y);

        String result2 = absY > 99 && absY < 1000 ? "It has 3 digits" : "It has no 3 digits";
        System.out.println(result2);
        // Note: Using '>' is better than using '>=', because there is single condition in the first
        // Note: if you use numbers in your code, you must Boundary Value Analysis(BVA) to test it.


        //// Type code to check following conditions for state abbreviations in the USA:
        // 1)it should have 2 characters    2)It should have just uppercase
        String s = "FL";
        String result3 = s.length() == 2 && s.replaceAll("[A-Z]", "").length() == 0 ? "Valid abbreviation" : "Invalid abbreviation";

    }
}
