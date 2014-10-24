package Algorithms.Warmup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class BC {
  int B;
  long C;

  public BC(int b, long c) {
    super();
    B = b;
    C = c;
  }
}


public class SherlockAndQueries {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int N;
    N = in.nextInt();
    int M;
    M = in.nextInt();

    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = in.nextLong();
    }
    int[] B = new int[M];
    for (int i = 0; i < M; i++) {
      B[i] = in.nextInt();
    }
    long[] C = new long[M];
    for (int i = 0; i < M; i++) {
      C[i] = in.nextLong();
    }
    BC[] bc = new BC[M];
    for (int i = 0; i < M; i++) {
      bc[i] = new BC(B[i], C[i]);
    }
    Arrays.sort(bc, new Comparator<BC>() {

      @Override
      public int compare(BC o1, BC o2) {
        return o1.B - o2.B;
      }

    });
    int idxInsert = 0;
    int idxScan = 1;
    while (idxScan < M) {
      if (bc[idxScan].B == bc[idxInsert].B) {
        bc[idxInsert].C = (bc[idxInsert].C * bc[idxScan].C) % (1000000000 + 7);
      } else {
        idxInsert++;
        bc[idxInsert].C = bc[idxScan].C;
        bc[idxInsert].B = bc[idxScan].B;
      }
      idxScan++;
    }
    idxInsert++;
    bc = Arrays.copyOfRange(bc, 0, idxInsert);

    for (int i = 0; i < idxInsert; i++) {
      for (int j = bc[i].B - 1; j < N; j += bc[i].B) {
        A[j] = (A[j] * bc[i].C) % (1000000000 + 7);
      }
    }
    StringBuilder sb = new StringBuilder(N * 11);
    for (long l : A) {
      sb.append(l).append(" ");
    }
    System.out.print(sb.toString());
    in.close();
  }
}
