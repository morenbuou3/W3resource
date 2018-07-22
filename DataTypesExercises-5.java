import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        int timeZone = scan.nextInt();
        long currentTime = System.currentTimeMillis() / 1000;
        long currentSeconds = currentTime % 60;
        long currentMinutes = currentTime / 60 % 60;
        long currentHours = (currentTime / 60 / 60 + timeZone) % 24;

        System.out.println("Current time is "
                + currentHours + ":" + currentMinutes + ":"
                + currentSeconds);
    }
}