package Algorithms.Combinatorics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BuildingAList {
  private static void solve(int N, String S) {
    char[] Sarr = S.toCharArray();
    Arrays.sort(Sarr);
    ArrayList<String> ret = new ArrayList<String>();
    for (int i = 1; i <= N; i++) {
      pickn(i, Sarr, 0, new StringBuilder(), ret);
    }
    Collections.sort(ret, new Comparator<String>() {
      @Override
      public int compare(String fruite1, String fruite2) {
        return fruite1.compareTo(fruite2);
      }
    });
    for (String s : ret) {
      System.out.println(s);
    }
  }

  private static void pickn(int n, char[] Sarr, int start, StringBuilder track,
      ArrayList<String> ret) {
    if (n == 0) {
      ret.add(new String(track));
      return;
    }
    for (int i = start; i < Sarr.length; i++) {
      track.append(Sarr[i]);
      pickn(n - 1, Sarr, i + 1, track, ret);
      track.deleteCharAt(track.length() - 1);
    }
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
      String S = in.next();
      solve(N, S);
    }
    in.close();
  }
}
