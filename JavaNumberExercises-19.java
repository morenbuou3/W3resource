import java.util.*;
import java.util.HashSet;

// cyclic number
public class Main {
	public static void main(String[] args) {	 
        Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        int num = sc.nextInt();
        if(isCyclic(num)) System.out.println("Number is a cyclic." );
        else System.out.println("Number is not a cyclic." );
    }


	public static boolean isCyclic (int n){
		String num = String.valueOf(n);
		for (int i = 1; i <= num.length(); i++) {
			int m = n * i;
			while (m > 0) {
				if (String.valueOf(n).indexOf("" + m % 10) == -1) return false;
				m /= 10;
			}
		}
		return true;
    }
    
}