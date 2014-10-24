package Algorithms.Warmup;

import java.util.Scanner;

public class SherlockAndSquares {
  private static long solveMeFirst(long a, long b) {
    double as = Math.ceil(Math.sqrt(a));
    double bs = Math.floor(Math.sqrt(b));
    return (long) (bs - as) + 1;
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int T;
    T = in.nextInt();
    for (int i = 0; i < T; i++) {
      long _a;
      _a = in.nextLong();
      long _b;
      _b = in.nextLong();
      long sum;
      sum = solveMeFirst(_a, _b);
      System.out.println(sum);
    }
    in.close();
  }
}
