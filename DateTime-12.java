import java.util.*;
import java.text.*;
import java.time.*;

// 获得本地化周名称
public class Main {
  public static void main(String[] args) {
  // Write your code here
  DateFormatSymbols symbols = new DateFormatSymbols(Locale.CHINA);
  String[] str = symbols.getWeekdays();
  for (String n : str){
    System.out.println(n);
  }
 }
}