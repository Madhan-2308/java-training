package Practising;
import java.util.Scanner;

public class DistanceOnEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the latitude of the first point (in degrees):");
        double lat1 = sc.nextDouble();

        System.out.println("Enter the longitude of the first point (in degrees):");
        double lon1 = sc.nextDouble();

        System.out.println("Enter the latitude of the second point (in degrees):");
        double lat2 = sc.nextDouble();

        System.out.println("Enter the longitude of the second point (in degrees):");
        double lon2 = sc.nextDouble();

        double distance = calculateDistance(lat1, lon1, lat2, lon2);
        System.out.printf("The distance between the two points is: %.2f km%n", distance);
    }

    private static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
       
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                   Math.cos(lat1) * Math.cos(lat2) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return 6371 * c; // Earth's radius in kilometers
    }

}
