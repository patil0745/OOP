public class Q19  {

    // Method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a square
    public static double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a circle
    public static double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Calculate the area of a rectangle
        double rectangleLength = 5.0;
        double rectangleWidth = 3.0;
        double rectangleArea = calculateArea(rectangleLength, rectangleWidth);
        System.out.println("Area of Rectangle: " + rectangleArea);

        // Calculate the area of a square
        double squareSide = 4.0;
        double squareArea = calculateArea(squareSide);
        System.out.println("Area of Square: " + squareArea);

        // Calculate the area of a circle
        float circleRadius = 2.5f;
        double circleArea = calculateArea(circleRadius);
        System.out.println("Area of Circle: " + circleArea);
    }
}
