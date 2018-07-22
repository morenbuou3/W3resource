import java.io.File;
import java.io.FilenameFilter;

// File Exists
public class Main {
	public static void main(String[] args) {
		// Write your code here
		File file = new File("/usr1/");
		if (file.exists()) {
		  System.out.println("The directory or file exists.");
		} else {
		  System.out.println("The directory or file not exists.");
		}
	}
}