package Algorithms.Warmup;

import java.util.Scanner;

public class FillingJars {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int _a;
    _a = in.nextInt();
    int _b;
    _b = in.nextInt();
    long sum = 0;
    for (int i = 0; i < _b; i++) {
      long a;
      a = in.nextInt();
      long b;
      b = in.nextInt();
      long k;
      k = in.nextInt();
      sum += (b - a + 1) * k;
    }

    System.out.println(sum / _a);
    in.close();
  }
}
