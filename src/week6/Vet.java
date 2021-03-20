package week6;

public class Vet {
    public static void feedDog(Dog d) {
        d.feed(25);
    }
    
    public static void feedNumber(int n) {
        n += 35;
        System.out.println(n);
    }
}
