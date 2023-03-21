import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      String curr = sc.next();
      String zeroTo255 = "([0-9]|[0-9][0-9]|[0-1][0-9][0-9]|[2][0-4][0-9]|[2][5][0-5])";
      Boolean bs = Pattern.matches(zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255, curr);
      System.out.println(bs);
    }
  }
}
