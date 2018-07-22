import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.text.*;

// extract Date Time 类的基本用法
public class Main {
  public static void main(String[] args) {
    try {    
      String str = "2018-07-20 23:02:00";
      Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
      String newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss").format(date);
       System.out.println("\n"+newstr+"\n");
      } 
    catch (ParseException e) {
    //Handle exception here
     e.printStackTrace();
     }
  }
}