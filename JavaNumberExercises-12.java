import java.util.*;
import java.util.HashSet;

// Harshad Number
public class Main {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
    System.out.print("Input a number : ");
    int num = sc.nextInt();
    if (isHNum(num)) System.out.print("is not a Harshad Number.");
    else System.out.print("is a Harshad Number.");
	}
	public static Boolean isHNum(int num){
	  int n = num;
	  int sum = 0;
	  while (n > 0) {
	    sum += n % 10;
	    n /= 10;
	  }
	  return n / sum == 0;
	}
}