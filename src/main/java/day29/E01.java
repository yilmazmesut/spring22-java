package day29;

public class E01 {

    public static void main(String[] args) {

        try {
        setAge(-12); // IllegalArgumentException

        }catch (IllegalArgumentException e) {
            System.out.println("Ages cannot be negative..");
        }


    }

    public static void setAge(int age) {
        if (age<0){
            throw new IllegalArgumentException();
        } else {
            System.out.println("The age is " + age);
        }
    }


}
