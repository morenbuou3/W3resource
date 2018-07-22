import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

// String 转 Date 类的基本用法
public class Main {
  public static void main(String[] args) {
	String datetime = "2018-07-20";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.CHINESE);
	LocalDate date = LocalDate.parse(datetime, formatter);
	System.out.println(date);
  }
}