package Algorithms.Combinatorics;

import java.math.BigInteger;
import java.util.Scanner;

public class ConnectingTowns {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int i = 0; i < T; i++) {
      int N = in.nextInt();
      String Ni[] = new String[N - 1];
      for (int j = 0; j < N - 1; j++) {
        Ni[j] = in.next();
      }
      //
      BigInteger out = BigInteger.ONE;
      for (int j = 0; j < N - 1; j++) {
        out = out.multiply(new BigInteger(Ni[j]));
      }
      System.out.println((out.mod(new BigInteger("1234567"))).toString());
    }
    in.close();
  }
}
