package week5;

public class Week5 {
    private static final int a =3;
    
    public static void main(String[] args) {  
       // a = 4;    // can't set "a" after its initialized
        
        // WARM-UP: recap "this" keyword 
//        SomeClass something = new SomeClass(); // creating a new instance of SomeClass
//        
//        SomeClass s1 = new SomeClass();
//        SomeClass s2 = new SomeClass();
//        SomeClass s3 = new SomeClass();
//        
//        System.out.println(SomeClass.totalSomeClasses);   // prints 4
//        
//        // something.warmUp();
//        
//        Someclass s = something.getMyself();
//        
//        System.out.println(something.getA()); //  print 3
//        System.out.println(s.getA()); // print 3
        
        // something and s refer to the same object       
        
        
        // STATIC MEMBERS
        
        // static access error

        // METHOD OVERLOADING
        
        // method overloading
            // different parameters
        
        //float d = getAverage(3.4f, 4.8f);
//        System.out.println(d);
    }
    
    public static double getAverage(int a, int b) {
        return ((double) a +b) /2;
    }
    public static float getAverage(float a, float b) {
        return (a+b)/2;
    }
}
