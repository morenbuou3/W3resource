import java.io.File;

// File
public class Main {
  public static void main(String[] args) {
  // Write your code here
  File file = new File("/home/");
  String[] fileList = file.list();
  for (String name : fileList) {
    System.out.println(name);
  }
 }
}