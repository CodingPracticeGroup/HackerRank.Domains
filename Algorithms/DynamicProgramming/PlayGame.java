package Algorithms.DynamicProgramming;

import java.util.Scanner;

public class PlayGame {
  private static long max(long... l) {
    long ret = l[0];
    for (Long ll : l) {
      ret = Math.max(ret, ll);
    }
    return ret;
  }

  private static long solve(long[] arr) {
    long dp[] = new long[arr.length];
    for (int i = 6; i < arr.length; i++) {
      dp[i] = max(dp[i - 4], dp[i - 3], dp[i - 2]) + arr[i];
      dp[i] = max(dp[i], max(dp[i - 5], dp[i - 4], dp[i - 3]) + arr[i - 1] + arr[i]);
      dp[i] = max(dp[i], max(dp[i - 6], dp[i - 5], dp[i - 4]) + arr[i - 2] + arr[i - 1] + arr[i]);
    }

    long max = dp[0];
    for (int i = 1; i < dp.length; i++) {
      max = Math.max(max, dp[i]);
    }
    return max;
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
      long arr[] = new long[N + 6];
      for (int j = 6; j < N + 6; j++) {
        arr[j] = in.nextLong();
      }
      System.out.println(solve(arr));
    }
    in.close();
  }
}
