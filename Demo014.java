

class UnaryDemo {
    void UnaryOp() {
        int a = 10, b = 5;
        
        // Post-increment: a is printed first, then incremented
        System.out.println("Post-increment (a++): " + a++);
        
        // Pre-increment: a is incremented first, then printed
        System.out.println("Pre-increment (++a): " + ++a);
        
        // Post-decrement: b is printed first, then decremented
        System.out.println("Post-decrement (b--): " + b--);
        
        // Pre-decrement: b is decremented first, then printed
        System.out.println("Pre-decrement (--b): " + --b);
        
        // Reset values for further operations
        a = 5;
        b = 5;
        
        // Complex expression
        int c = a++ * --b * a;
        System.out.println("Result of a++ * --b * a: " + c);
    }
}

public class Demo014 {
    public static void main(String[] args) {
        UnaryDemo obj = new UnaryDemo();
        obj.UnaryOp();
    }
}

