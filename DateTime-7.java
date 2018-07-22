import java.util.*;

// 当前月的最后一天
public class Main {
  public static void main(String[] args) {
  // Write your code here
  TimeZone timezone = TimeZone.getTimeZone("Asia/Hong_Kong");
  Calendar calendar = Calendar.getInstance(timezone);
  calendar.set(Calendar.MONTH, 1);
  System.out.println("当前月的最后一天" + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
 }
}