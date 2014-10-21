package Algorithms.Warmup;

import java.util.HashSet;
import java.util.Scanner;

public class GemStones {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    int _a;
    _a = in.nextInt();
    String _b;
    _b = in.next();
    HashSet<Character> pool = new HashSet<Character>();
    for (int j = 0; j < _b.length(); j++) {
      pool.add(_b.charAt(j));
    }
    HashSet<Character> tmp = new HashSet<Character>();
    for (int i = 1; i < _a; i++) {
      _b = in.next();
      for (int j = 0; j < _b.length(); j++) {
        tmp.add(_b.charAt(j));
      }
      pool.retainAll(tmp);
      tmp.clear();
    }
    System.out.println(pool.size());
    in.close();
  }
}
