import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.text.*;

// SimpleDateFormat 类的基本用法
public class Main {
  public static void main(String[] args) {
	//Unix seconds
	long unixTime = new Date().getTime();
	//convert seconds to milliseconds
	Date date = new Date(unixTime); 
	// format of the date
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
	sdf.setTimeZone(TimeZone.getTimeZone("Asia/Chongqing"));
	String javaDate = sdf.format(date);
	System.out.println(javaDate);
  }
}