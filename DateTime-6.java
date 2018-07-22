import java.util.*;

// 当前时间具体信息
public class Main {
  public static void main(String[] args) {
  // Write your code here
  TimeZone timezone = TimeZone.getTimeZone("Asia/Hong_Kong");
  Calendar calendar = Calendar.getInstance(timezone);
  System.out.println(calendar.get(Calendar.YEAR) +"-"+ calendar.get(Calendar.MONTH)
    +"-"+ calendar.get(Calendar.DAY_OF_MONTH) +" "+ calendar.get(Calendar.HOUR) 
    +":"+ calendar.get(Calendar.MINUTE) +":"+ calendar.get(Calendar.SECOND)
    + " " +calendar.get(Calendar.MILLISECOND));
 }
}