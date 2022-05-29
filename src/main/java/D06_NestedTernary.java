public class D06_NestedTernary {
    public static void main(String[] args) {
        /*
            Type java code by using nested ternary.
            Write a program to check if a year is leap year or not.
            If the year is divisible by 100 then it must be divisible by 400.
            If a year is not divisible by 100 then it must be divisible by 4.
         */

        int year = 1800;
        String result = year%100==0 ? (year%400==0 ? "Leap year" : "Not a leap year") : (year%4==0 ? "Leap year" : "Not a leap year");
        System.out.println(result);

        // What if ternary returns different data types?
        String s = "Tom Hanks";

        // If you have different data types in ternary, to see outputs on the cosole you can put the ternary directly inside the System.out.println
        System.out.println(s.startsWith("T") ? s.length() : String.valueOf(s.charAt(0)));

        // If it is mandatory to create a container for the result of the ternary, convert data types to the same data type.
        String result2 = s.startsWith("K") ? String.valueOf(s.length()) : String.valueOf(s.charAt(0));
        System.out.println(result2);



    }
}
