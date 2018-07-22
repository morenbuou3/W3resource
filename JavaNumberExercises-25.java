import java.util.*;
import java.util.HashSet;

// pell number
public class Main {
	public static void main(String[] args) {	 
		for (int i = 1; i <= 20; i++) {
			System.out.print(pellNumber(i)+" ");
		}
	}
	
	public static int pellNumber(int n) {	 
		if (n == 1) return 0;
		if (n == 2) return 1;
		return pellNumber(n - 1) * 2 + pellNumber(n - 2);
	}
}