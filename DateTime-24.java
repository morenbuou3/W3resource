import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 得到LocalDate格式
public class Main {
  public static void main(String[] args) {
	 LocalDate now = LocalDate.now();
	 System.out.println(now);
	 System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MMM-uuuu")));
  
    LocalDateTime now2 = LocalDateTime.now();
    System.out.println(now2);
	 System.out.println(now2.format(DateTimeFormatter.ofPattern("dd-MMM-uuuu HH::mm::ss")));
  
    Instant timestamp = Instant.now();
		System.out.println(timestamp);
		LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48", DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
		System.out.println(dt);
  }
}