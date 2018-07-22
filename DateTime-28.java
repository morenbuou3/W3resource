import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// LocalDateTime 类的基本用法
public class Main {
  public static void main(String[] args) {
	LocalDateTime dateTime = LocalDateTime.now().minusHours(4).minusMinutes(4);
	System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());  
	System.out.println("Before 4 houres and 4 minutes: " + dateTime+"\n");
  }
}