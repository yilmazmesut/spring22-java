public class D2_Variables {

    public static void main(String[] args) {

        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);

        //If you create a variable inside the "main method", Java will accept them as "static" automatically

        //Create a char variable
        //Do not forget to putt the value between single quotes
        //Default value of char is the character whose value is zero
        char initial = 'S';

        //Create a boolean variable
        //Default value of boolean is false
        boolean isOld = true;
        boolean isAlive = false;

        //Create a byte variable
        byte ageOfStd = 13;

        //Create a short variable
        short populationOfVillage = 21000;

        //Create a long variable
        //Do not forget to put L to the end when you create a long variable
        long populationOfWorld = 7123456789L;
    }
    //How to create a variable
    // Data Type - Variable Name - Equal Sign - Value - Semi Colon
    static   int           age              =          12       ;

    //Create an integer variable
    static int height = 183;

    //Create a double variable
    public static double weight = 85.7;

        //Note: If you do not type any access modifier, it means the access modifier is "default"

    /*
                Data Types in Java

        1)Primitive Data Types:
             i)Those data types were created by Java, we cannot create any primitive data type
             ii)Primitive data types are 8
                a)byte - short - int - long - float - double / char - boolean
                    char: It is for single characters like A, h, ?, !, etc.
                    boolean: It is for true-false values
                    byte: It is used for the values from -128 to 127. It is for whole numbers
                    short: It is used for the values from -32 thousand sth to positive 32 thousand sth. It is for whole numbers
                    int: It is used for the values from -2 billion sth to 2 billion sth. It is for whole numbers
                    long: It is used for the values from .... to ..... It is for whole numbers
                    float:It is used for decimals. float uses memory less than double.
                          When you create float as data type you have to put 'F' or 'f' at the end
                          float has 7 digits at most in decimal part.
                    double:It is used for decimals. double is used for scientific researches
                           double has 16 digits at most in decimal part.

        2)Non-Primitive Data Types
     */
}
