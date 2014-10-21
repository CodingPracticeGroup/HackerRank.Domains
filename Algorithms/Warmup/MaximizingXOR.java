package Algorithms.Warmup;

import java.util.Scanner;

public class MaximizingXOR {
  /*
   * Complete the function below.
   */

  static int maxXor(int l, int r) {
    int max = Integer.MIN_VALUE;
    for (int a = l; a <= r; a++) {
      for (int b = a; b <= r; b++) {
        max = Math.max(a ^ b, max);
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int res;
    int _l;
    _l = Integer.parseInt(in.nextLine());

    int _r;
    _r = Integer.parseInt(in.nextLine());

    res = maxXor(_l, _r);
    System.out.println(res);

    in.close();
  }
}
