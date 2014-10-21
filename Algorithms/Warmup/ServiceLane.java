package Algorithms.Warmup;

import java.util.Scanner;

public class ServiceLane {
  private static int findMinOneScan(int[] width, int ii, int jj) {
    int min = width[ii];
    for (int i = ii + 1; i <= jj; i++) {
      min = Math.min(min, width[i]);
    }
    return min;
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int N;
    N = in.nextInt();
    int T;
    T = in.nextInt();
    int[] width = new int[N];
    for (int i = 0; i < N; i++) {
      width[i] = in.nextInt();
    }
    for (int i = 0; i < T; i++) {
      int ii, jj;
      ii = in.nextInt();
      jj = in.nextInt();
      int min = findMinOneScan(width, ii, jj);
      System.out.println(min);
    }
    in.close();
  }
}
