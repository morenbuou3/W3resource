import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input weight in pounds: ");
        double weight = scan.nextDouble();
        System.out.print("Input height in inches: ");
        double height = scan.nextDouble();
        double mass = weight * 0.45359237 / (height * 0.0254 * height * 0.0254);
        System.out.println("Body Mass Index is " + mass);
    }
}