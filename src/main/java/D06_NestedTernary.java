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
        s.startsWith("T") ? s.length() : s.charAt(0)
    }
}
