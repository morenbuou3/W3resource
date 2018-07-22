import java.util.Calendar;

// 得到最小年分，本年最小月份，本周最小周数，本月最小日数
public class Main {
  public static void main(String[] args) {
  // Write your code here
  Calendar calendar = Calendar.getInstance();
  calendar.set(Calendar.MONTH, 1);
  int year = calendar.getActualMinimum(Calendar.YEAR);
  int month = calendar.getActualMinimum(Calendar.MONTH) + 1;
  int day = calendar.getActualMinimum(Calendar.DAY_OF_WEEK);
  int day2 = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
  int date = calendar.getActualMinimum(Calendar.DATE);
  int date2 = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
  
  System.out.println("year: " + year);
  System.out.println("month: " + month);
  System.out.println("day: " + day);
  System.out.println("day2: " + day2);
  System.out.println("date: " + date);
  System.out.println("date2: " + date2);
 }
}