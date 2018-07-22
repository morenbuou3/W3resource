import java.util.*;
import java.text.*;
import java.time.*;

// 判定闰年
public class Main {
  public static void main(String[] args) {
  // Write your code hereTimeZone.getTimeZone("Asia/Hong_Kong")
  int year = 2018;
  if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
    System.out.println("Year " + year + " is a leap year");
  else
    System.out.println("Year " + year + " is not a leap year");
  }
}