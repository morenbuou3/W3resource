import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

// Duration 类的基本用法
public class Main {
  public static void main(String[] args) {
    LocalDateTime now2 = LocalDateTime.of(2015, 7, 1, 21, 10);
    LocalDateTime now = LocalDateTime.now();
    
    int diffInNano = Duration.between(now, now2).getNano();
     long diffInSeconds = Duration.between(now, now2).getSeconds();
     long diffInMilli = Duration.between(now, now2).toMillis();
     long diffInMinutes = Duration.between(now, now2).toMinutes();
     long diffInHours = Duration.between(now, now2).toHours();
     System.out.printf("\nDifference is %d Hours, %d Minutes, %d Milli, %d Seconds and %d Nano\n\n", 
                   diffInHours, diffInMinutes, diffInMilli, diffInSeconds, diffInNano );
  }
}