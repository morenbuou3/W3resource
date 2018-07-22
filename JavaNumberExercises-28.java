import java.util.*;
import java.util.HashSet;

// Hamming number
public class Main {
	public static void main( String args[] ){ 
        for (int i = 1, count = 0; count <= 20; i++) {
			if (isHamming(i)) {
				System.out.println(i);
				count++;
			}				
		}
    }
  
	public static Boolean isHamming(int n){
		if (n == 1 || n == 2 || n == 3 || n == 5) return true;
		String str = "";
		for (int i = 2; i < n; i++) {
			if (isPrime(i) && n % i == 0) str += i;
		}
		if (str.length() > 3 || str.length() == 0) return false;
		if (str.length() == 1 && (isContains2(str) || isContains3(str) || isContains5(str))) return true;
		if (str.length() == 2) {
			if (isContains2(str) && isContains3(str)) return true;
			if (isContains3(str) && isContains5(str)) return true;
			if (isContains2(str) && isContains5(str)) return true;
			return false;
		}
		if (str.length() == 3 && isContains2(str) && isContains3(str) && isContains5(str)) return true;
		return false;
	}
	public static Boolean isContains2(String n){
		return n.indexOf("2") != -1;
	}
	public static Boolean isContains3(String n){
		return n.indexOf("3") != -1;
	}
	public static Boolean isContains5(String n){
		return n.indexOf("5") != -1;
	}
	public static Boolean isPrime(int n){
		if (n == 1) return false;
		for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}
}