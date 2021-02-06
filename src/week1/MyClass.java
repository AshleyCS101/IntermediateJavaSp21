package week1;

//Welcome to Intermediate Java Programming!

public class MyClass {
    public static void main(String[] args) {
        //warmUp();
        
        // primitive types
        
        // assignment and implicit casting    
        int m = (int) 25.3;
        double p = 34;
        // Java avoids loss of precision, but is okay with more precision
        // Precise to less precise: double, float, int
        
        // math operation precision
        // when java calculates math, it stores the intermediate type 
        // as the most precise of the pair of values
        double result1 = (5/2) + 3.5; //6.5
        double result2 = (5.0/2) + 3.5; //6.0
        
        //boolean
        boolean b; //initializes to false
        
        //math operators
        // + - * / %
        // mod operator (%) work on int types
        int q = 45 % 4;  // remainder of 45/4 = 1
        
        // mod is useful for figuring out even numbers, and getting last digit
        int y = 24 % 2; // if y % 2 == 0, then y is even, else if y % 2 == 1, y is odd
        int lastDigit = 80299843 % 10; // =3; anything % 10 gives the last digit
        
        // ++ --
        // *=
        int w =1;
        w *= 3; // w = w*3;
        
        //Boolean operators
        // && ||
        // >=, >, < <=, ==, !=
        // !
        
        // operatorExercise();
        
        // Boolean short-circuiting
        // false && something == false
        // true || something == true
        
        //if/else
        int r = 248399; //something
        if(r%2 ==0) {
            System.out.println("r is even!");
        } else{
            System.out.println("r is odd!");
        }     
    }
    
    public static void warmUp() {
        // What is the output of the following?
        
        int a = 4/5; // 0
        System.out.println("The output of a is: " + a);        
    }
    
    public static void operatorExercise() {
        // What is the output of the following?
        
        boolean b = true || ((false && !(true && false)) || (!true || !false));
        // all the stuff after "true ||" doesn't matter-- b is already guaranteed true
        System.out.println("The output of b is: " + b);
    }

}


// Java prefers precision, avoids loss of precision
// assignment and implicit casting
// math operations and precision precedence

// Intermediate stored value: most precise type java has encountered in any operation pair
// Assignment happens AFTER the operation is calculated, do not confuse the two-- they happen separately


// boolean short-circuit on || and &&
// if java can tell what the value of a boolean operation is before calculating the other half, 
// it won't bother calculating the other half

/*
Math Operator Precedence: follows basic order of operations. Operators on same level go left-to-right
    1) Parentheses (first)
    2) ++, --
    3) *, /, %
    4) +, -
    5) Assignment operators (last)
*/

