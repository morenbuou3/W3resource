import java.util.*;
import java.text.*;
import java.time.*;

// 获得本地当前后一年
public class Main {
  public static void main(String[] args) {
  // Write your code hereTimeZone.getTimeZone("Asia/Hong_Kong")
  Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Hong_Kong"));
  cal.add(Calendar.YEAR, 1);
  Date after = cal.getTime();
  cal.add(Calendar.YEAR, -2);
  Date before = cal.getTime();
  System.out.println(after);
  System.out.println(before);
  }
}