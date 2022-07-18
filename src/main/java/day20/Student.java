package day20;

public class Student {

    //1)Create private variables
    private String name = "Tom Hanks";
    private int age = 13;
    private boolean successful = true;

    //2)Create constructors you need
    public Student() {
    }
    public Student(String name, int age, boolean successful) {
        this.name = name;
        this.age = age;
        this.successful = successful;
    }

    //3)Create getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isSuccessful() {
        return successful;
    }

    //4)Create setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    //5)Create toString()
    @Override //If you want to see object details on the console, create "toString()" method.
    public String toString() {
        return "Student:" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", successful=" + successful;
    }
}
