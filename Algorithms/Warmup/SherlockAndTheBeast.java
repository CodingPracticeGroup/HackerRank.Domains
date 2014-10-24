package Algorithms.Warmup;

import java.util.Scanner;

public class SherlockAndTheBeast {
  private static void solve(int N) {
    for (int x = 0; x <= N; x += 5) {
      int y = N - x;
      if (y % 3 == 0) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < y; i++) {
          sb.append('5');
        }

        for (int i = 0; i < x; i++) {
          sb.append('3');
        }
        System.out.print(sb.toString());
        System.out.println();
        return;
      }
    }
    System.out.println("-1");
    return;
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
      solve(_b);

    }
    in.close();
  }
}
