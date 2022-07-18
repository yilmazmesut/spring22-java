package day17;

public class StaticKeyword01 {

/*
        Question 1: How do you use non-static things inside the "main" method?
                    There are 2 ways;
                    i)Make it static
                    ii)Create an object then by the help of the object
                       use it in "main" method
        Question 2: How do you access to static and non-static things from outside the class?
                    i)Just Class Name is enough to access static things
                    ii)You have to create object to access non-static things
     */

    public static int sCounter = 0;
    public int counter = 0;

    public StaticKeyword01(){       // constructor
        sCounter++;
        counter++;
    }

    public static void main(String[] args) {

        /*
         the things like Moon in Java is called static
         xtatic tinghs are common for all objects
         any update on static things will effect all objects and will be visible by all object
         */

        StaticKeyword01 obj1 = new StaticKeyword01();   // object from constructor
        StaticKeyword01 obj2 = new StaticKeyword01();
        StaticKeyword01 obj3 = new StaticKeyword01();


    }
}
