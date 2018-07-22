import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// LocalTime 和 Time 类的基本用法
public class Main {
  public static void main(String[] args) {
	LocalTime time = LocalTime.of(12, 24, 32);  
	int hour = time.getHour(); 
	int minute = time.getMinute();  
	int second = time.getSecond(); 
	System.out.println("\nCurrent Local time: " + time);
	System.out.println("Hour: " + hour);
	System.out.println("Minue: " + minute); 
	System.out.println("Second: " +second+"\n");
  }
}