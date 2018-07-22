import java.time.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Year类的基本用法
public class Main {
  public static void main(String[] args) {
	 //Current year	
	   Year year = Year.now();
     System.out.println(year);  
     boolean isLeap = year.isLeap();
     System.out.println("Is current year leap year? " + isLeap);  
     int length = year.length();
     System.out.println("Length of the year: " + length+" days\n"); 
  }
}