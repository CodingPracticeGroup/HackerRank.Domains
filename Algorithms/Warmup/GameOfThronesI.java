package Algorithms.Warmup;

import java.util.HashMap;
import java.util.Scanner;

public class GameOfThronesI {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    String inputString = myScan.nextLine();

    String ans;
    // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the
    // required condition
    HashMap<Character, Integer> countit = new HashMap<Character, Integer>();
    for (int i = 0; i < inputString.length(); i++) {
      char c = inputString.charAt(i);
      if (countit.containsKey(c)) {
        countit.put(c, countit.get(c) + 1);
      } else {
        countit.put(c, 1);
      }
    }
    int oddcount = 0;
    for (Integer i : countit.values()) {
      if (i % 2 == 1) {
        oddcount++;
      }
    }
    if (oddcount > 1) {
      ans = "NO";
    } else {
      ans = "YES";
    }

    System.out.println(ans);
    myScan.close();
  }
}
