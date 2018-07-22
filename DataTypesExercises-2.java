import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a value for inch: ");
        double inches = scan.nextDouble();
        double meters = inches * 0.0254;
        System.out.println(inches + " inch is "
                + meters + " meters");
    }
}