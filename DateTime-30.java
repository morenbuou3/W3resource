import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

// Period 类的基本用法
public class Main {
  public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	LocalDate now2 = LocalDate.of(2015, 07, 01);
	
	Period diff = Period.between(now2, now);
	System.out.printf("%d years, %d month, %d day",
		diff.getYears(), diff.getMonths(), diff.getDays());
  }
}