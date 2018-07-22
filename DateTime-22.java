import java.util.*;
import java.text.*;
import java.time.*;

// 得到前后十天日期
public class Main {
  public static void main(String[] args) {
	Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
	cal.add(Calendar.DAY_OF_YEAR, 10);
	Date after = cal.getTime();
	cal.add(Calendar.DAY_OF_YEAR, -20);
	Date before = cal.getTime();
	System.out.println(after);
	System.out.println(before);
	
	LocalDate today = LocalDate.now(); 
	System.out.println("\nCurrent Date: "+today);
	System.out.println("10 days before today will be "+today.plusDays(-10));
	System.out.println("10 days after today will be "+today.plusDays(10)+"\n");
  }
}