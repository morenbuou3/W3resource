import java.time.*;
import java.time.temporal.TemporalAdjusters;

// TemporalAdjusters 类的基本用法
public class Main {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
  
    LocalDate nextFriday = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
    LocalDate previousFriday = now.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
    
    System.out.println(nextFriday);
    System.out.println(previousFriday);
  }
}