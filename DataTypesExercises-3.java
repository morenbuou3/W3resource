import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int origin = scan.nextInt();
        int number = origin;
        int sum = 0;
        while(number / 10 != 0) {
            sum += number % 10;
            number = number / 10;
        }
        sum += number;
        System.out.println("The sum of all digits in "
                + origin + " is " + sum);
    }
}