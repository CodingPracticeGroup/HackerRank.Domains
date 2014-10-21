package Algorithms.Warmup;

import java.util.Scanner;

public class IsFibo {
  private static boolean isFibo(long N) {
    if (N == 0) {
      return true;
    } else if (N == 1) {
      return true;
    }
    long i = 0;
    long j = 1;
    while (j < N) {
      long tmp = i + j;
      //
      i = j;
      j = tmp;
    }
    if (j == N) {
      return true;
    } else {
      return false;
    }
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
      _b = in.nextLong();
      if (isFibo(_b)) {
        System.out.println("IsFibo");
      } else {
        System.out.println("IsNotFibo");
      }
    }
    in.close();
  }
}
