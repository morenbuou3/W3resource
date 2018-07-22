public class Main {
	// 计算丑数
  public static void main(String[] args) {
  // Write your code here
  if (isUgly(6)) {
    System.out.print("It is an ugly number.");
  } else {
    System.out.print("It is not an ugly number.");
  }
 }
 
  private static Boolean isUgly(int n) {
    while (n > 1) {
      if (n % 2 == 0) {
        n /= 2;
      } else if (n % 3 == 0) {
        n /= 3;
      } else if (n % 5 == 0) {
        n /= 5;
      } else {
        return false;
      }
    }
    return true;
  }
}