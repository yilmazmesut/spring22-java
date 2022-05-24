public class D04_Operations {

    /*
    Operations in Java
    1) +, -, *, /   (Addition, Subtraction, Multiplication, Division)
        Order of operations: 1)Operations inside parenthesis
                             2) Multiplications and divisions
                             3) Additions and subtractions

    2) Increment and Decrement operations
        Increment ==> addition and multiplication
        Decrement ==> subtraction and division

    3) Comparison Operators
        >, <, >=, <=, ==, !=
        greater than sign, less than sign, greater than sign or equal to, less than sign or equal to, equality, net equal

        Note: In math, single equal sign '=' means 'equality', but in Java double equal sign '==' means 'equality'
        Note: In java, '!' means 'not', so '!=" means 'not equal'
        Note: All comparison operators return boolean.

    4) Logical Operators
        i) AND Operator: && ==> This operator is used between two boolean values
        ii) OR Operator: || ==> This operator is used between two boolean values (optimist)

     */

    public static void main(String[] args) {

        // Order of Operations
        int result = 10 - 6/(2+ 5/5) + 7;
        System.out.println(result);

        // Increment
        int a = 12;
        // a = a+3;
        a+=3;
        System.out.println(a); // 15

        int b= 4;
        // b=b*3;
        b*=3;
        System.out.println(b); // 12

        // Decrement
        int c = 18;
        c-=3;
        System.out.println(c); // 15

        int d = 24;
        d/=6;
        System.out.println(d); // 4

        // Increment and Decrement by 1:
        int e = 12;
        e = e+1;    //13
        e+=1;       //14
        e++;        //15
        System.out.println(e); //15

        int f = 13;
        f = f-1;    //12
        f-=1;       //11
        f--;        //10
        System.out.println(f);  //10

        // Comparison Operators:
        int h = 12;
        int i = 13;

        System.out.println(h < i);  // true
        System.out.println(h==i);   // false
        System.out.println(h<=i);   // true
        System.out.println(h!=i);   // true


        // Logical Operator
        System.out.println(3<4 && 5>1); //true
        System.out.println(3>4 && 5>1); //false

        System.out.println(3>4 || 5>6); //false


        // Post-increment and Pre-increment

        // Post-increment:
        int x = 12;
        int y = x++;
        System.out.println(y);  //12
        System.out.println(x);  //13

        // Pre-increment
        int m = 12;
        int n = ++m;
        System.out.println(n);  //13
        System.out.println(m);  //13



    }
}
