import java.util.*;

// 求一定范围随机数
public class Main {
  public static void main(String[] args) {
  // Write your code here
  Random random = new Random();
  for (int i = 0; i < 20; i++) {
    System.out.println(random.nextInt(10));
  }
  
  int start = 5, end = 10;
  for (int i = 0; i < 20; i++) {
    System.out.println(start + (int)(Math.random() * ((end - start) + 1)));
  }
 }
}