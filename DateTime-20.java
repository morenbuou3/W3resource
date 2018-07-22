import java.util.*;
import java.text.*;
import java.time.*;

// 得到当前时间戳
public class Main {
  public static void main(String[] args) {
  // Write your code hereTimeZone.getTimeZone("Asia/Hong_Kong")
  Instant timestamp = Instant.now(); 
  System.out.println("Current Timestamp: " + timestamp+"\n"); 
  }
}