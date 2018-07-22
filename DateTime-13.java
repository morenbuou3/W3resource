import java.util.*;
import java.text.*;
import java.time.*;

// 获得今天是周几
public class Main {
  public static void main(String[] args) {
  // Write your code here
  Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Hong_Kong"));
  cal.setFirstDayOfWeek(Calendar.MONDAY);
  System.out.println(cal.get(Calendar.DAY_OF_WEEK));
  }
}