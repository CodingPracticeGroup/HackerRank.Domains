package Algorithms.Warmup;

import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndGCD {
  static int gcd(int a, int b) {
    while (a != 0 && b != 0) // until either one of them is 0
    {
      // a / b = c .. d
      // b / d = e .. f
      // d / f = g .. h
      int tmp = b;
      b = a % b;
      a = tmp;
    }
    return a + b; // either one is 0, so return the non-zero value
  }

  private static boolean check(int[] arr) {
    if (arr.length <= 1) {
      return false;
    }
    Arrays.sort(arr);
    int gcd = gcd(arr[0], arr[1]);
    if (gcd == 1) {
      return true;
    }
    for (int i = 2; i < arr.length; i++) {
      gcd = Math.min(gcd, gcd(gcd, arr[i]));
      if (gcd == 1) {
        return true;
      }
    }
    return false;
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
      int arr[] = new int[_b];
      for (int j = 0; j < _b; j++) {
        arr[j] = in.nextInt();
      }
      boolean b = check(arr);
      if (b)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
    in.close();
  }
}
