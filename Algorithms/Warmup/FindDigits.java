package Algorithms.Warmup;

import java.util.Scanner;

public class FindDigits {
  private static int solve(long b) {
    String bs = String.valueOf(b);
    int count = 0;
    for (int i = 0; i < bs.length(); i++) {
      int t = bs.charAt(i) - '0';
      if (t != 0 && b % t == 0) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int _a;
    _a = in.nextInt();
    for (int i = 0; i < _a; i++) {
      long _b;
      _b = in.nextInt();
      int sum;
      sum = solve(_b);
      System.out.println(sum);
    }
    in.close();
  }
}
