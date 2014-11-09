package Algorithms.Combinatorics;

import java.util.Scanner;

public class MinimumDraws {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int i = 0; i < T; i++) {
      int N = in.nextInt();
      System.out.println(N + 1);
    }
    in.close();
  }
}
