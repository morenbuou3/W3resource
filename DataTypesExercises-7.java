import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double meters = scan.nextDouble();
        System.out.print("Input hour: ");
        double hours = scan.nextDouble();
        System.out.print("Input minutes: ");
        double minutes = scan.nextDouble();
        System.out.print("Input seconds: ");
        double seconds = scan.nextDouble();

        double metersSecond = meters / (hours * 3600 + minutes * 60 + seconds);
        double kmHour = meters / 1000.0 / (hours + minutes / 60.0 + seconds / 3600.0);
        double milesHour = meters / 1609.0 / (hours + minutes / 60.0 + seconds / 3600.0);
        System.out.println("Your speed in meters/second is " + metersSecond);
        System.out.println("Your speed in km/h is " + kmHour);
        System.out.println("Your speed in miles/h is " + milesHour);
    }
}