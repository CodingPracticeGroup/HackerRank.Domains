package Algorithms.DynamicProgramming;

import java.util.Scanner;

public class Candies {
  private static int solve(int[] rating) {
    int dpLR[] = new int[rating.length];
    dpLR[0] = 1;
    for (int i = 1; i < rating.length; i++) {
      if (rating[i - 1] < rating[i]) {
        dpLR[i] = dpLR[i - 1] + 1;
      } else {
        dpLR[i] = 1;
      }
    }
    //
    int dpRL[] = new int[rating.length];
    dpRL[rating.length - 1] = 1;
    for (int i = rating.length - 2; i >= 0; i--) {
      if (rating[i] > rating[i + 1]) {
        dpRL[i] = dpRL[i + 1] + 1;
      } else {
        dpRL[i] = 1;
      }
    }
    //
    int sum = 0;
    for (int i = 0; i < rating.length; i++) {
      sum += Math.max(dpLR[i], dpRL[i]);
    }
    return sum;
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int rating[] = new int[N];
    for (int i = 0; i < N; i++) {
      rating[i] = in.nextInt();
    }
    int candy = solve(rating);
    System.out.println(candy);
    in.close();
  }
}
