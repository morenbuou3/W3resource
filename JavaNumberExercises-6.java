import java.util.*;

// 求水仙花数
public class Main {
	public static void main(String[] args) {
		int i = 0, count = 0;
		while (count < 15) {
			if (isNarcissistic(i)) {
				System.out.println(i);
				count++;
			}
			i++;
		}
	}

	private static Boolean isNarcissistic(int n){
		if(n < 0) return false;
		int len = ("" + n).length();
		int temp = n;
		long sum = 0;
		for(int i = 0; i < len; i++){
			sum += Math.pow(temp % 10, len);
			temp /= 10;
		}
		return sum == n;
	}	
}