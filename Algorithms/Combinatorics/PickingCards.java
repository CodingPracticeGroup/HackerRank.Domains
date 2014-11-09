package Algorithms.Combinatorics;

import java.util.Arrays;
import java.util.Scanner;

public class PickingCards {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int i = 0; i < T; i++) {
      int N = in.nextInt();
      int ci[] = new int[N];
      for (int j = 0; j < N; j++) {
        ci[j] = in.nextInt();
      }
      //
      Arrays.sort(ci);
      boolean cannotbedone = false;
      for (int j = 0; j < ci.length; j++) {
        if (ci[j] > j) {
          cannotbedone = true;
        }
      }
      if (cannotbedone) {
        System.out.println(0);
      } else {

      }
    }
    in.close();
  }
}
