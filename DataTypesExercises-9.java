import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input 1st integer: ");
      int n1 = sc.nextInt();
      System.out.print("Input 1st integer: ");
      int n2 = sc.nextInt();
      
      int sum = n1 + n2;
      int diff = n1 - n2;
      int product = n1 * n2;
      double avg = (n1 + n2) / 2;
      int dist = Math.abs(n1 - n2);
      int max = Math.max(n1, n2);
      int min = Math.min(n1, n2);

      System.out.printf("Sum of two integers: %d%n", sum);
        System.out.printf("Difference of two integers: %d%n", diff);
        System.out.printf("Product of two integers: %d%n", product);
        System.out.printf("Average of two integers: %.2f%n", avg);
        System.out.printf("Distance of two integers: %d%n", dist);
        System.out.printf("Max integer: %d%n", max);
        System.out.printf("Min integer: %d%n", min);
    }
}