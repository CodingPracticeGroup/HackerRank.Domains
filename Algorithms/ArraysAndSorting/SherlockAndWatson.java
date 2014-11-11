package Algorithms.ArraysAndSorting;

import java.util.Scanner;

public class SherlockAndWatson {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int K = in.nextInt();
    int Q = in.nextInt();
    int A[] = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = in.nextInt();
    }
    int start = N - K % N;
    for (int i = 0; i < Q; i++) {
      int x = in.nextInt();
      System.out.println(A[(start + x) % N]);
    }
    in.close();
  }
}
