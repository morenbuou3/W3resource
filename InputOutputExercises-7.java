import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

// file.lastModified()
public class Main {
	public static void main(String[] args) {
		// Write your code here
		File file = new File("/home/");
		Date date=new Date(file.lastModified());
		System.out.println("The file was last modified on: "+date+"\n");
	}
}