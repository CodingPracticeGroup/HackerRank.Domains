package Algorithms.Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class BiggerIsGreater {
  private static String solveMeFirst(String s) {
    char[] sarr = s.toCharArray();
    //
    int p = sarr.length - 2;
    while (p >= 0 && sarr[p] >= sarr[p + 1]) {
      p--;
    }
    if (p < 0) {
      return "no answer";
    }
    //
    int q = p + 1;
    while (q < sarr.length && sarr[p] < sarr[q]) {
      q++;
    }
    q--;
    //
    char tmp = sarr[q];
    sarr[q] = sarr[p];
    sarr[p] = tmp;
    //
    Arrays.sort(sarr, p + 1, sarr.length);

    return new String(sarr);
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
      String sum;
      sum = solveMeFirst(_b);
      System.out.println(sum);
    }

    in.close();
  }
}
