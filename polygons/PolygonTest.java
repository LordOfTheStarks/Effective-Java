package polygons;

public class PolygonTest {
    public static void main(String[] args) {
        Polygon square = new Polygon (0, 0, 9, 0, 9, 9, 0, 9);

        System.out.println("Square: " + square);

        double area1 = square.calculateArea1();
        System.out.println("Area using Trapezoid Formula: " + area1);

        double area2 = square.calculateArea2();
        System.out.println("Area using Triangle Formula: " + area2);

        square.smooth();

        System.out.println("Smoothed Square: " + square);


        Polygon pentagon = new Polygon(0, 0, 2, 0, 3, 1, 1, 3, -1, 1);
        System.out.println("Pentagon: " + pentagon);
        System.out.println("Area using Trapezoid Formula: " + pentagon.calculateArea1());
        System.out.println("Area using Triangle Formula: " + pentagon.calculateArea2());
    }
}
