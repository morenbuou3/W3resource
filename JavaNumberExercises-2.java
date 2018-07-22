import java.util.*;

// 求abundant，deficient，perfect
public class Main {
  public static void main(String[] args) {
  // Write your code here
  int abundant = 0, deficient = 0, perfect = 0; 
  for (int i = 1; i <= 10000; i++) {
    if (sumDivs(i) > i) abundant++;
    if (sumDivs(i) < i) deficient++;
    if (sumDivs(i) == i) perfect++;
  }
  System.out.println("Deficient number: " + deficient);
  System.out.println("Perfect number: " + perfect);
  System.out.println("Abundant number: " + abundant);
 }
 
  private static int sumDivs (int n) {
    List<Integer> divs = getDivisior(n);
    int result = 0;
    for (Integer div : divs) {
      result += div;
    }
    return result;
  }
  
  private static List<Integer> getDivisior (int n) {
    List<Integer> divs = new ArrayList<Integer>();
    for (int i = 1; i < n; i++) {
      if (n % i == 0) divs.add(i);
    }
    return divs;
  }
}