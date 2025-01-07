import java.util.Scanner;

class Circle {
    // Method to calculate the area of a circle
    double calculateArea(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}

public class Demo012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the radius
        System.out.print("Enter the radius of the circle: ");
        int radius = scanner.nextInt();
        
        // Create an object of the Circle class
        Circle circle = new Circle();
        
        // Calculate and display the area
        double area = circle.calculateArea(radius);
        System.out.println("The circle area is: " + area);
        
        scanner.close();
    }
}

