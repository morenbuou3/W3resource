import java.util.*;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		for(long num = 1,count = 0;count<8;num++){
           if(isHappy(num)){
               System.out.println(num);
               count++;
           }
       }
	}	
	public static Boolean isHappy(long n) {
		long m = 0;
		int digit = 0;
		HashSet<Long> cycle = new HashSet<Long>();
		while(n != 1 && cycle.add(n)){
			m = 0;
			while(n > 0){
			   digit = (int)(n % 10);
			   m += digit*digit;
			   n /= 10;
			}
			n = m;
		}
		return n == 1;
	}
}