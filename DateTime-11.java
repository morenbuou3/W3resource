import java.util.*;
import java.text.*;
import java.time.*;

// 本月最大天数
public class Main {
  public static void main(String[] args) {
  // Write your code here
  TimeZone timezone = TimeZone.getTimeZone("Asia/Hong_Kong");
  Calendar cal = Calendar.getInstance(timezone);
  System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
 }
}