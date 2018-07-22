import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input six non-negative digits: ");
      int number = sc.nextInt();
      int[] nums = new int[(number + "").length()];
      int index = nums.length - 1;
      while (number / 10 != 0) {
        nums[index] = number % 10;
        number /= 10;
        index--;
      }
      nums[index] = number;
      for (int i = 0; i < nums.length - 1; i++) {
        System.out.print(nums[i] + " ");
      }
      System.out.print(nums[nums.length - 1]);
    }
}