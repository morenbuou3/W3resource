import java.util.Calendar;

// 得到最大年分，本年最大月份，本周最大周数，本月最大日数
public class Main {
  public static void main(String[] args) {
  // Write your code here
  Calendar calendar = Calendar.getInstance();
  calendar.set(Calendar.MONTH, 1);
  int year = calendar.getActualMaximum(Calendar.YEAR);
  int month = calendar.getActualMaximum(Calendar.MONTH) + 1;
  int day = calendar.getActualMaximum(Calendar.DAY_OF_WEEK);
  int day2 = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
  int date = calendar.getActualMaximum(Calendar.DATE);
  int date2 = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
  
  System.out.println("year: " + year);
  System.out.println("month: " + month);
  System.out.println("day: " + day);
  System.out.println("day2: " + day2);
  System.out.println("date: " + date);
  System.out.println("date2: " + date2);
 }
}