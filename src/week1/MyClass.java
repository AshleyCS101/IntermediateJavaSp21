package week1;

//Welcome to Intermediate Java Programming!

public class MyClass {
    public static void main(String[] args) {
        //warmUp();
        //operatorPrecedence();

    }
    
    public static void warmUp() {
        // What is the output of the following?
        
        int a = 3/2;
        System.out.println("The output of a is: " + a);        
    }
    
    public static void operatorPrecedence() {
        // What is the output of the following?
        
        boolean b = true || ((false && !(true && false)) || (!true || !false));
        System.out.println("The output of b is: " + b);
    }

}





/*
Math Operator Precedence: follows basic order of operations
1) Parentheses
2) ++, --
3) *, /, %
4) +, -
5) Assignment operators
*/

