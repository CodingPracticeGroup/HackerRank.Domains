package Algorithms.Warmup;

import java.util.Scanner;

public class TheLoveLetterMystery {
  private static int findMinChange(String s) {
    int sum = 0;
    for (int i = 0; i < s.length() / 2; i++) {
      sum += Math.abs(s.charAt(i) - s.charAt(s.length() - i - 1));
    }
    return sum;
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
      String _b;
      _b = in.next();
      int sum;
      sum = findMinChange(_b);
      System.out.println(sum);
    }
    in.close();
  }
}
