package Algorithms.Warmup;

import java.util.Scanner;

public class ChocolateFeast {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
    }
    in.close();
  }

  private static long Solve(int N, int C, int M) {
    // Write code to solve each of the test over here
    long iniNum = N / C;
    long wrapper = iniNum;
    while (wrapper >= M) {
      long anotherCholoate = wrapper / M;
      iniNum += anotherCholoate;
      wrapper = wrapper - anotherCholoate * M + anotherCholoate;
    }
    return iniNum;
  }
}
