import java.util.*;
import java.util.HashSet;

// Cube number
public class Main {
	public static void main(String[] args) {	 
        Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        int num = sc.nextInt();
        if(isCube(num)) System.out.println("Number is a cube." );
        else System.out.println("Number is not a cube." );
    }


	public static boolean isCube( int n ){
        for (int i = 1; i <= n; i++) {
			if (Math.pow(i, 3) == n) return true;
		}
		return false;
    }
    
}