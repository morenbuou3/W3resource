import java.util.*;
import java.text.*;
import java.time.*;

// 获得本地当前时间加几个小时
public class Main {
  public static void main(String[] args) {
  // Write your code hereTimeZone.getTimeZone("Asia/Hong_Kong")
  LocalTime time = LocalTime.now();
  System.out.println("Local time now : " + time.plusHours(1));
  }
}