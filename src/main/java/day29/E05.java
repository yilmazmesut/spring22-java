package day29;

public class E05 {

    public static void main(String[] args) throws IllegalGradeException {
        int grade = 120;
        if (grade>100 || grade<0) {
            throw new IllegalGradeException("Grades must be from zero to hundred");
        } else {
            System.out.println("Your grade is " + grade);
        }
    }

    static class IllegalGradeException extends Exception {
        String message;
        public IllegalGradeException(String message){
            this.message = message;
        }
        public String toString(){
            return message;
        }
    }


}
