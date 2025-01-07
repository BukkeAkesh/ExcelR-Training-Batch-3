

class TriangleAreaDemo1 {
    // Method to calculate the area of a triangle using Heron's formula
    double getTriangleArea(int s1, int s2, int s3) {
        double s = (s1 + s2 + s3) / 2.0; // Use 2.0 to ensure proper division
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
}

public class Demo013 {
    public static void main(String[] args) {
        int s1 = 5, s2 = 6, s3 = 7;
        
        // Create an object of TriangleAreaDemo1
        TriangleAreaDemo1 ta = new TriangleAreaDemo1();
        
        // Call getTriangleArea and store the result
        double area = ta.getTriangleArea(s1, s2, s3);
        
        // Print the triangle area
        System.out.println("The triangle area is: " + area);
    }
}

