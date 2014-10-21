package Algorithms.Warmup;

import java.util.Scanner;

public class UtopianTree {
  private static long calcHeight(int cycle) {
    int i = 0;
    int startHeight = 1;
    while (i < cycle) {
      if (i < cycle) {
        startHeight *= 2;
        i++;
      }
      if (i < cycle) {
        startHeight += 1;
        i++;
      }
    }
    return startHeight;
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
      int _b;
      _b = in.nextInt();
      long height;
      height = calcHeight(_b);
      System.out.println(height);
    }
    in.close();
  }
}
