import java.util.*;
import java.text.*;
import java.time.*;

// 判定两个日期差几年几个月
public class Main {
  public static void main(String[] args) {
  // Write your code hereTimeZone.getTimeZone("Asia/Hong_Kong")
  LocalDate day1 = LocalDate.now();    
  LocalDate day2 = LocalDate.of(2015, 7, 15); 
  Period diff = Period.between(day1, day2); 
  System.out.println("\nDifference between "+ day1 +" and "+ day2 +": " 
    + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
  }
}