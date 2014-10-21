package Algorithms.Warmup;

import java.util.Scanner;

public class HalloweenParty {
  // a+b=n => f=ab = a(n-a) => draw figure f(a) and find a to make f(a) max
  private static long calcProduct(long b) {
    return (b / 2) * (b / 2 + (b % 2 == 0 ? 0 : 1));
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
      long sum;
      sum = calcProduct(_b);
      System.out.println(sum);
    }
    in.close();
  }
}
