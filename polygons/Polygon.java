package polygons;

import java.util.ArrayList;
import java.util.List;

public class Polygon {
    private List<Point> vertices;

    public Polygon(double... coordinates) {
        vertices = new ArrayList<>();

        for(int i = 0; i < coordinates.length; i+=2) {
            vertices.add(new Point(coordinates[i], coordinates[i+1]));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(Point vertex : vertices) {
            sb.append("(").append(vertex.getX()).append(", ").append(vertex.getY()).append(")");
        }
        sb.append("}");
        return sb.toString();
    }
    public double calculateArea1() {
        int n = vertices.size();
        double sum1 = 0.0;
        double sum2 = 0.0;

        for(int i = 0; i < n; i++) {
            double x1 = vertices.get(i).getX();
            double y1 = vertices.get(i).getY();
            double x2 = vertices.get((i+1) % n).getX();
            double y2 = vertices.get((i+1) % n).getY();

            sum1 += x1 * y2;
            sum2 += y1 * x2;
        }
        return Math.abs(sum1 - sum2) / 2.0;
    }
    public double calculateArea2() {
        int n = vertices.size();
        double area = 0.0;

        for(int i = 1; i < n -1; i++) {
            double x1 = vertices.get(0).getX();
            double y1 = vertices.get(0).getY();
            double x2 = vertices.get(i).getX();
            double y2 = vertices.get(i).getY();
            double x3 = vertices.get(i+1).getX();
            double y3 = vertices.get(i+1).getY();

            area += (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
        }
        return Math.abs(area);
    }
    public void smooth() {
        List<Point> newVertices = new ArrayList<>();

        int n = vertices.size();
        for (int i = 0; i < n; i++) {
            Point p = vertices.get(i);
            Point next = vertices.get((i + 1) % n);

            double x1 = p.getX() + (next.getX() - p.getX()) / 3.0;
            double y1 = p.getY() + (next.getY() - p.getY()) / 3.0;
            Point p1 = new Point(x1, y1);

            double x2 = p.getX() + 2 * (next.getX() - p.getX()) / 3.0;
            double y2 = p.getY() + 2 * (next.getY() - p.getY()) / 3.0;
            Point p2 = new Point(x2, y2);

            newVertices.add(p1);
            newVertices.add(p2);
        }
        vertices = newVertices;
    }
}