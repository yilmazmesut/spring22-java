public class D09_StringManipulation04 {

    public static void main(String[] args) {

        //// Type a code to find the number of punctuation marks used in a String

        String str = "Wow!... Ali is 13 years old, and he is a university student.";
        int totalNumOfChars = str.length();

        // \\p{Punct} ==> All punctuation marks
        String strWithoutPunctuationMarks = str.replaceAll("\\p{Punct}","");
        int totalNumOfCharsWithoutPunctuation = strWithoutPunctuationMarks.length();
        System.out.println(totalNumOfChars - totalNumOfCharsWithoutPunctuation);


        //// Create a method prints greetings by using the given name
          // Ali ==> Ali => Hi Ali          Tom ==> Hi Tom
        greetUser("Ali");
        System.out.println(greetUser("Ali"));


        //// Create a method makes the decimal part has 5 digits:
        System.out.println(limitDecimalPart(12.21f));

    }

    private static String greetUser(String name) {
        return String.format("Hi %s", name);
        // %s ==> every % will put that string into your main string
    }

    public static String limitDecimalPart(float number) {
        return String.format("The price is %.5f", number);
        // %.5 ==> put that float into decimal part
    }
}
