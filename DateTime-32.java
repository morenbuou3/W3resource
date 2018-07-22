import java.time.*;
import java.util.*;

// Period 类的基本用法
public class Main {
  public static void main(String[] args) {
    LocalDate born = LocalDate.of(1992, 5, 14);
    LocalDate now = LocalDate.now();
  
    Period age = Period.between(born, now);
    System.out.printf("我今年年龄：%d 岁", age.getYears());
  }
}