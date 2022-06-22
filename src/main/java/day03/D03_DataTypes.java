package day03;

public class D03_DataTypes {

    /*
        Data Casting: Converting number primitive data type to another number primitive data type.

            byte - short - int - long - float - double
            --->> Auto Widening: (converting small data type to large data type)
            <<--- Explicit Narrowing: (converting large data type to small data type)

        Wrapper Class: for number primitive data types. we convert them to non-primitive data types.
            Normally primitive data types have just value, do not have methods.
            With wrapper class we can use this primitive data types as a non-primitive data types. So they will have methods.
                byte --> Byte
                short --> Short
                int --> Integer
                long --> Long
                float --> Float
                double --> Double
                char --> Character
                boolean --> Boolean

        Memory Usage in Java
            There are 2 types of memories in Java
                1)Stack Memory ==> Small
                2)Heap Memory ==> Huge

                In a Stack Memory there are 2 things:
            1)Primitive data is stored in "Stack" memory.
            2)Java puts the addresses(reference) of non-primitive data, into "Stack Memory".

            When you create non-primitive data, Java will put it in to Heap Memory,
         create an address for it and put  it in to Stack Memory.
    */

    public static void main(String[] args) {

        // Auto Widening:
        byte age = 12;
        int myAge = age;

        short populationOfVillage = 21000;
        double myPopulationOfVillage = populationOfVillage;

        // Explicit Narrowing
        double x = 23.45;
        long y = (long) x;


        String name = "Mark Twain";
        System.out.println("name.toUpperCase() = " + name.toUpperCase()); //MARK TWAIN
        System.out.println("name.toLowerCase() = " + name.toLowerCase()); //mark twain
        System.out.println("name.length() = " + (name.length()-1)); //9



            // Wrapper Classes:
        Byte yourAge = 13;
        yourAge.intValue();
        Boolean isOld = true;

        // Note 1: If a method is static, you can access to method by using class name.
        // Note 2: Byte and Boolean are both a data type and a class.

        // If you access a method by using class name, then the method is called "static method".
        // If you access a method without using class name then the method is called "non-static" method.

        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE); // -128
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE); // 1.4E-45
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE); // 1.7976931348623157E308




        // Auto Boxing: ==> (converting  primitive one to wrapper class)
        //              This is done by Java automatically
        int a = 12;
        Integer b = a;

        // Un-Boxing: ==> (converting wrapper class to primitive one)
        int c = b;


    }
}
