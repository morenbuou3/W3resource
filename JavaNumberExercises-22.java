import java.util.*;
import java.util.HashSet;

// Mersenne number
public class Main {
	public static void main(String[] args) {	 
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = sc.nextInt();
		if (isMersenne(num)) System.out.println(num + " is a Mersenne number.");
        else System.out.println(num + " is not a Mersenne number.");
	}
	public static Boolean isMersenne(int n) {	 
		if (!isPrime(n)) return false;
        if ((n + 1) % 2 == 0) return true;
		return false;
	}
	public static Boolean isPrime(int n) {
		if (n == 1) return false;
		for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;      
	}
}