package Algorithms.Combinatorics;

import java.math.BigInteger;
import java.util.Scanner;

public class DiwaliLights {
  private static String solve(int N) {
    BigInteger ret = (new BigInteger("2")).pow(N);
    ret = ret.subtract(BigInteger.ONE);
    ret = ret.mod(new BigInteger("100000"));
    return ret.toString();
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
      System.out.println(solve(N));
    }
    in.close();
  }
}
