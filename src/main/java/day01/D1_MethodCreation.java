package day01;

public class D1_MethodCreation {

    public static void main(String[] args) {

        System.out.println(addIntegers(12,5));
        System.out.println(multiplyIntegers(8,5));
        System.out.println(subtractionIntegers(4,7));

        System.out.println("method1() = " + method1(24,5));
        System.out.println("method2() = " + method2(24,5));
        System.out.println("method3() = " + method3(24,5));
    }

    // Create an addition method:
    public static int addIntegers(int a,int b){
        return a+b;
    }

    // Create a multiplication method:
    public static int multiplyIntegers(int x, int y){
        return x*y;
    }

    // Create a subtraction method:
    public static int subtractionIntegers(int a,int b){
        return a-b;
    }

    // Create a dynamic division method:
    public static double method1(int a, int b){
        return a/b;
        /* If all values are integer, result should be integer!
           24 / 5 = 4.0               */

        // Note 1: If you use same data types for all values in a mathematical operation,
        //         the result will be in the same data type.
    }

    public static double method2(double a, double b){

        return a/b;
        /* if all values are double, result should be double!
           24.0 / 5.0 = 4.8         */
    }


    public static double method3(double a, int b){
        return a/b;
        /* if all values are double, result should be double!
           24.0 / 5 = 4.8         */
    }
    // Note 2: If you use different data types in a mathematical operation,
    //         the result will be in the largest data type.
}
