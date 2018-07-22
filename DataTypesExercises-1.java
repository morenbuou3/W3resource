import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Input a degree in Fahrenheit: ");
      double fahrenheit = scan.nextDouble();
      double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
      System.out.println(fahrenheit + " degree Fahrenheit is equal to "
                          + celsius + " in Celsius");
    }
}