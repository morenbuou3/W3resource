import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.text.*;

// 得到格林时间毫秒数
public class Main {
  public static void main(String[] args) {
	long seconds = System.currentTimeMillis() / 1000l;
	System.out.println("\nSeconds since 1970: "+seconds+"\n");
  }
}