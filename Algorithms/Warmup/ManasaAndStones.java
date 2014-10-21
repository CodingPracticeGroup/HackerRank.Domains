package Algorithms.Warmup;

import java.util.Scanner;

public class ManasaAndStones {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int _a;
    _a = in.nextInt();
    for (int i = 0; i < _a; i++) {
      int step;
      step = in.nextInt();
      int a;
      a = in.nextInt();
      int b;
      b = in.nextInt();
      if (a == b)
        System.out.println(a * (step - 1));
      else {
        if (a > b) {
          int tmp = a;
          a = b;
          b = tmp;
        }
        for (int j = 0; j < step; j++) {
          System.out.print(a * (step - 1) + (b - a) * j);
          System.out.print(" ");
        }
        System.out.println();
      }
    }
    in.close();
  }
}
