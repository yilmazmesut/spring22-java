package day28;

public class E02 {

    public static void main(String[] args) {

        String[] arr = {"A", "C", "B"};

        getElementFromArray(arr,0); // A
        getElementFromArray(arr,3); // ArrayIndexOutOfBoundsException ==> Run-time Exception
    }

    public static void getElementFromArray(String [] s, int idx){

        try{
            System.out.println(s[idx]);
        } catch (Exception e) {
            System.err.println(e.getMessage() + " Non-existing index was used");
        }

    }
}
