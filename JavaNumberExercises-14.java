import java.util.*;
import java.util.HashSet;

// 求Pronic数
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number : ");
		int num = sc.nextInt();
		
		int temp = num * num;
		String str = String.valueOf(temp);
		String str2 = String.valueOf(num);
		 
		if(str.endsWith(str2))
			System.out.println("Pronic Number.");
		else
			System.out.println("Not a Pronic Number.");
	}
}