import java.io.File;
import java.io.FilenameFilter;

// compareTo AscII 相减
public class Main {
	public static void main(String[] args) {
		// Write your code here
		String name1 = "Ava C++";
		String name2 = "ava C++";
		String name3 = "cva C++";
		String name4 = "aba C++";
		
		int var1 = name1.compareTo(name2);
		System.out.println("name1 & name2 comparison: "+var1);
		
		int var2 = name2.compareTo(name3);
		System.out.println("name2 & name3 comparison: "+var2);
		
		int var3 = name3.compareTo(name4);
		System.out.println("name3 & name4 comparison: "+var3);
		
		int var4 = name2.compareTo(name4);
		System.out.println("name2 & name4 comparison: "+var4);
	}
}