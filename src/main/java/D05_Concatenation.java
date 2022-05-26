public class D05_Concatenation {

    /*
        Concatenation: Joining Strings with each other or with other data types
                        To do concatenation we have 2 options:
                            1) Use '+' sigh ==> Can be used with all data types
                            2) Use 'concat()' method ==> inside the concat() method parentheses you can put just String, not the other.
     */

    public static void main(String[] args) {

        String s = "Tom";
        String t = "Hanks";
        int i = 12;
        int k = 5;
        char c = 'A';

        System.out.println(s + " " + t);  // Tom Hanks
        System.out.println(s.concat(" ").concat(t));    // Tom Hanks

        System.out.println(s + i + k);  // Tom125
        System.out.println(s.concat("125"));    // Tom125

        System.out.println(s + (i + k));  // Tom17
        System.out.println(i + k + s);  // 17Tom
        System.out.println(i + s + k);  // 12Tom5
        System.out.println(s + k*i);    // Tom60

        System.out.println(i + c + s);  // 12 + 65 + Tom = 77Tom
        System.out.println(c + s + k);  // ATom5
        
    }
}
