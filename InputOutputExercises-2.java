import java.io.File;
import java.io.FilenameFilter;

// FilenameFilter
public class Main {
  public static void main(String[] args) {
  // Write your code here
  File file = new File("/usr/");
  String[] fileList = file.list(new FilenameFilter() {
	  @Override
	  public boolean accept(File dir, String name) {
		  if (name.toLowerCase().endsWith("n")) {
			  return true;
		  } else {
			  return false;
		  }
	  }
  });
  for (String name : fileList) {
    System.out.println(name);
  }
 }
}