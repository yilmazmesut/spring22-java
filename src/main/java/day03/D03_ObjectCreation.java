package day03;

public class D03_ObjectCreation {

    /*
        How to create template?
        1)How to create a class
        2)How to create methods in a class
        3)How to create object from a class
     */

    public static void main(String[] args) {

        // Create an object to be able to use non-static class members(methods  and variables).
        //ClassName         Object Name     =   new     ClassName()         ;
        D03_ObjectCreation   myObject       =   new   D03_ObjectCreation()  ;

        myObject.calculateAge(1990);
        System.out.println(myObject.calculateAge(1990));
        myObject.printName("Mark", "Twain");
    }

    public String printName(String firstname, String lastname){
        return firstname + " " + lastname;
    }

    public int calculateAge(int dob){
        return 2022 - dob;
    }

    int height = 185;
    String id = "Sp2022-001";
}
