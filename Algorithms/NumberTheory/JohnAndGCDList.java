package Algorithms.NumberTheory;

import java.util.Scanner;

public class JohnAndGCDList {
  private static int GCD(int number1, int number2) {
    if (number2 == 0) {
      return number1;
    }
    return GCD(number2, number1 % number2);
  }

  private static void solve(int A[]) {
    int B[] = new int[A.length + 1];
    B[0] = A[0];
    B[A.length] = A[A.length - 1];
    for (int i = 1; i < B.length - 1; i++) {
      B[i] = A[i - 1] * A[i] / GCD(A[i - 1], A[i]);
    }
    //
    for (int i = 0; i < B.length; i++) {
      System.out.print(B[i]);
      if (i < B.length - 1) {
        System.out.print(' ');
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int i = 0; i < T; i++) {
      int N = in.nextInt();
      int A[] = new int[N];
      for (int j = 0; j < N; j++) {
        A[j] = in.nextInt();
      }
      solve(A);
    }
    in.close();
  }
}
