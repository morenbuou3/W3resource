import java.io.File;
import java.io.FilenameFilter;

// File Permission
public class Main {
	public static void main(String[] args) {
		// Write your code here
		File file = new File("/home/app");
		if (file.canWrite()) {
		  System.out.println("The directory or file can write.");
		} else {
		  System.out.println("The directory or file can not write.");
		}
		if (file.canRead()) {
		  System.out.println("The directory or file can read.");
		} else {
		  System.out.println("The directory or file can not read.");
		}
	}
}