import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        int minutes = scan.nextInt();
        int day = minutes / (24 * 60);
        int year = day / 365;
        day = day % 365;
        System.out.println(minutes + " minutes is approximately "
                + year + " years and " + day + " days");
    }
}