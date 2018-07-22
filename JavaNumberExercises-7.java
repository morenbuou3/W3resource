import java.util.*;

// 求Lucas数
public class Main {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(lucasNum(i));
		}
	}

	private static int lucasNum(int n){
		if (n == 1) return 2;
		if (n == 2) return 1;
		return lucasNum(n - 2) + lucasNum(n - 1);
	}	
}