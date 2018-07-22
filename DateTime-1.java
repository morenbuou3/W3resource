import java.util.Calendar;
import java.util.Date;

// 设定一个Calendar实例
public class Main {
  public static void main(String[] args) {
  // Write your code here
  Calendar calendar = Calendar.getInstance();
  Date now = calendar.getTime();
  System.out.println(now);
  
  calendar.set(2018, 6, 20);
  Date now2 = calendar.getTime();
  System.out.println(now2);
  
  calendar.set(Calendar.YEAR, 2018);
  calendar.set(Calendar.MONTH, 6);
  calendar.set(Calendar.DAY_OF_MONTH, 19);
  Date now3 = calendar.getTime();
  System.out.println(now3);
 }
}