package Algorithms.Warmup;

import java.util.Scanner;

public class CutTheSticks {
  private static int cut(int[] stick) {
    int count = 0;
    int maxHeight = Integer.MIN_VALUE;
    do {
      int minPositve = minPositve(stick);
      for (int i = 0; i < stick.length; i++) {
        stick[i] -= minPositve;
      }
      maxHeight = positiveExist(stick);
    } while (maxHeight > 0);
    return count;
  }

  private static int minPositve(int[] stick) {
    int count = 0;
    int minPositive = Integer.MAX_VALUE;
    for (int i = 0; i < stick.length; i++) {
      if (stick[i] > 0) {
        minPositive = Math.min(minPositive, stick[i]);
        count++;
      }
    }
    if (count > 0)
      System.out.println(count);
    return minPositive;
  }

  private static int positiveExist(int[] stick) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < stick.length; i++) {
      max = Math.max(max, stick[i]);
    }
    return max;
  }

  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int _a;
    _a = in.nextInt();
    int[] stick = new int[_a];
    for (int i = 0; i < _a; i++) {
      int _b;
      _b = in.nextInt();
      stick[i] = _b;
    }
    cut(stick);
    in.close();
  }
}
