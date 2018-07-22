import java.util.*;
import java.text.*;
import java.time.*;

// 得到所有时区当前时间
public class Main {
  public static void main(String[] args) {
	ZoneId.SHORT_IDS.keySet().stream().forEach( 
		zoneKey ->
			System.out.println(
				" " + ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey)) +": "
					+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get(zoneKey))) 
			)
	);
  }
}