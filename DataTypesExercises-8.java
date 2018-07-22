import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input the side length value: ");
      double n = sc.nextDouble();

      System.out.printf("Square: %12.2f\n", Math.pow(n, 2));
      System.out.printf("Cube: %14.2f\n", Math.pow(n, 3));
      System.out.printf("Fourth power: %6.2f\n", Math.pow(n, 4));
    }
}