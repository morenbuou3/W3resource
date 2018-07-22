import java.util.*;
import java.text.*;
import java.time.*;

// 本月的第一天和最后一天分别是周几
public class Main {
  public static void main(String[] args) {
  // Write your code here
  YearMonth yeartime = YearMonth.of(2018, 7);
  LocalDate first = yeartime.atDay(1);
  LocalDate last = yeartime.atEndOfMonth();
  DayOfWeek a = first.getDayOfWeek();
  DayOfWeek b = last.getDayOfWeek();
  System.out.println(a.name());
  System.out.println(b.name());
 }
}