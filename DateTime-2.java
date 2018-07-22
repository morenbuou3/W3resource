import java.util.Calendar;

// 当前时间年月日时分秒
public class Main {
  public static void main(String[] args) {
  // Write your code here
  Calendar calendar = Calendar.getInstance();
  int year = calendar.get(Calendar.YEAR);
  int month = calendar.get(Calendar.MONTH);
  int day = calendar.get(Calendar.DAY_OF_MONTH);
  int hour = calendar.get(Calendar.HOUR);
  int minute = calendar.get(Calendar.MINUTE);
  int second = calendar.get(Calendar.SECOND);
  
  System.out.println(year + "-" + month + "-" + day
                      + " " + hour + ":" + minute + ":" + second);
 }
}