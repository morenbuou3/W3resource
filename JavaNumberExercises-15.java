import java.util.*;
import java.util.HashSet;

// Duck number
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number : ");
		String num = sc.nextLine();				
		 
		if(num.indexOf("0") != -1 && !num.startsWith("0"))
			System.out.println("Duck Number.");
		else
			System.out.println("Not a Duck Number.");
	}
}