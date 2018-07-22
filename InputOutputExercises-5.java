import java.io.File;
import java.io.FilenameFilter;

// File isDirectory isFile getAbsolutePath
public class Main {
	public static void main(String[] args) {
		// Write your code here
		File file = new File("/home/app");
		if (file.isDirectory()) {
		  System.out.println(file.getAbsolutePath() + " is a directory.");
		} else {
		  System.out.println(file.getAbsolutePath() + " is not a directory.");
		}
		if (file.isFile()) {
		  System.out.println(file.getAbsolutePath() + " is a file.");
		} else {
		  System.out.println(file.getAbsolutePath() + " is a not file.");
		}
	}
}