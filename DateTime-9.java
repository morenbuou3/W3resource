import java.util.*;
import java.text.*;

// 本周的第一天和最后一天的日期
public class Main {
  public static void main(String[] args) {
  // Write your code here
  TimeZone timezone = TimeZone.getTimeZone("Asia/Hong_Kong");
  Calendar calendar = Calendar.getInstance(timezone);
  calendar.setFirstDayOfWeek(Calendar.MONDAY);
  calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
  DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
  
  System.out.println(df.format(calendar.getTime()));
  calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
  System.out.println(df.format(calendar.getTime()));
 }
}