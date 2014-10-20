package Algorithms.Strings;

import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    s = s.toLowerCase();
    HashSet<Character> pool = new HashSet<Character>();
    for (char i = 'a'; i <= 'z'; i++) {
      pool.add(i);
    }
    for (int i = 0; i < s.length(); i++) {
      if (pool.contains(s.charAt(i))) {
        pool.remove(s.charAt(i));
        if (pool.isEmpty()) {
          System.out.println("pangram");
          in.close();
          return;
        }
      }
    }
    System.out.println("not pangram");
    in.close();
  }
}
