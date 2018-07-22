import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Month类的基本用法
public class Main {
  public static void main(String[] args) {
	//Current year	
	LocalDate now = LocalDate.of(2018, 7, 20);
	Month month = now.getMonth();
	int value = month.getValue();
	int minLength= month.minLength();
	int maxLength = month.maxLength();
	Month firstMonthOfQuarter = month.firstMonthOfQuarter();

	System.out.println("\nInteger value of the current month: " + value);
	System.out.println("Length of the month: " + minLength);
	System.out.println("Maximum length of the month: " + maxLength); 
	System.out.println("First month of the Quarter: " + firstMonthOfQuarter+"\n"); 
  }
}