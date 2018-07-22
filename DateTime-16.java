import java.util.*;
import java.text.*;
import java.time.*;

// 获得本地当前时间加两周
public class Main {
  public static void main(String[] args) {
  // Write your code hereTimeZone.getTimeZone("Asia/Hong_Kong")
  Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Hong_Kong"));
  cal.add(Calendar.DAY_OF_YEAR, 14);
  System.out.println(cal.getTime());
  }
}