import java.util.*;

// 本月最后一天的Date日期
public class Main {
  public static void main(String[] args) {
  // Write your code here
  TimeZone timezone = TimeZone.getTimeZone("Asia/Hong_Kong");
  Calendar calendar = Calendar.getInstance(timezone);
  calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
  System.out.println("本月最后一天的Date日期" + calendar.getTime());
 }
}