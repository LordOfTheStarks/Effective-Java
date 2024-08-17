import java.util.Scanner;

public class TourPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of places (-1 for default): ");
        int numPlaces = scanner.nextInt();

        if (numPlaces == -1) {
            numPlaces = 3;
        }

        String[] placeNames = new String[numPlaces];
        int[] heights = new int[numPlaces];
        double[] distances = new double[numPlaces];

        for (int i = 0; i < numPlaces; i++) {
            System.out.println((i + 1) + ". Place");

            System.out.print("Name: ");
            placeNames[i] = scanner.next();

            System.out.print("Altitude [m]: ");
            heights[i] = scanner.nextInt();

            System.out.print("Distance from start [km]: ");
            distances[i] = scanner.nextDouble();
        }

        System.out.print("Uphill speed [m/h]: ");
        int uphillSpeed = scanner.nextInt();

        System.out.print("Downhill speed [m/h]: ");
        int downhillSpeed = scanner.nextInt();

        System.out.print("Horizontal speed [km/h]: ");
        int horizontalSpeed = scanner.nextInt();

        int totalTime = 0;

        for (int i = 0; i < numPlaces; i++) {

            int flatTime = (int) ((distances[i] / horizontalSpeed) * 60);

            double heightDiff = heights[i] - (i > 0 ? heights[i - 1] : 0);
            int uphillTime = heightDiff > 0 ? (int) ((heightDiff / (double) uphillSpeed) * 60) : 0;

            int walkTime = Math.max(flatTime, uphillTime) + Math.min(flatTime, uphillTime) / 2;

            int hours = totalTime / 60;
            int mins = totalTime % 60;
            System.out.println(placeNames[i].toUpperCase() + " " + hours + ":" + mins);
            totalTime += walkTime;

            if (i < numPlaces - 1) {
                double descent = Math.abs(heights[i] - heights[i + 1]) / 1000.0;
                int descentTime = (int) (descent / downhillSpeed * 60);
                totalTime += descentTime;
            }
        }
        scanner.close();
    }
}