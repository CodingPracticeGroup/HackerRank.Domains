package Algorithms.Warmup;

import java.util.BitSet;
import java.util.Scanner;

public class ACMICPCTeam {
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
    BitSet[] matrix = new BitSet[_a];
    for (int i = 0; i < _a; i++) {
      matrix[i] = new BitSet(_b);
      String row = in.next();
      for (int j = 0; j < _b; j++) {
        matrix[i].set(j, row.charAt(j) == '1');
      }
    }
    int out1 = 0;
    int out2 = 0;
    for (int i = 0; i < _a; i++) {
      for (int j = i + 1; j < _a; j++) {
        BitSet tmp = (BitSet) matrix[i].clone();
        tmp.or(matrix[j]);
        int tmpCar = tmp.cardinality();
        if (out1 < tmpCar) {
          out1 = tmpCar;
          out2 = 1;
        } else if (out1 == tmpCar) {
          out2++;
        }
      }
    }
    System.out.println(out1);
    System.out.println(out2);
    in.close();
  }
}
