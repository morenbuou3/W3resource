import java.time.*;
import java.time.temporal.TemporalAdjusters;

// LocalDateTime 类的基本用法
public class Main {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime now2 = now.withHour(0).withMinute(0).withSecond(0);
  
    System.out.println(now2);
  }
}