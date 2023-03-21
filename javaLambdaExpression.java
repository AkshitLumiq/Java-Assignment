import java.io.*;
import java.util.*;

interface PerformOperation {
  boolean check(int a);
}

class MyMath {
  public static boolean checker(PerformOperation p, int num) {
    return p.check(num);
  }

  PerformOperation isOdd() {
    PerformOperation abc = (int a) -> {
      if (a % 2 == 0)
        return false;

      return true;
    };

    return abc;
  }

  PerformOperation isPrime() {
    PerformOperation abc = (int a) -> {
      boolean flag = true;

      if (a <= 1)
        flag = false;

      for (int i = 2; i <= a / 2 && flag; i++) {
        if (a % i == 0 && a != i)
          flag = false;
      }
      return flag;
    };

    return abc;
  }

  PerformOperation isPalindrome() {
    PerformOperation abc = (int a) -> {
      String curr = Integer.toString(a);
      String rev = "";

      for (int i = curr.length() - 1; i >= 0; i--)
        rev = rev + curr.charAt(i);

      if (curr.compareTo(rev) == 0)
        return true;
      return false;
    };
    return abc;
  }
}

public class Solution {

  public static void main(String[] args) throws IOException {
    MyMath ob = new MyMath();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine());
    PerformOperation op;
    boolean ret = false;
    String ans = null;
    while (T-- > 0) {
      String s = br.readLine().trim();
      StringTokenizer st = new StringTokenizer(s);
      int ch = Integer.parseInt(st.nextToken());
      int num = Integer.parseInt(st.nextToken());
      if (ch == 1) {
        op = ob.isOdd();
        ret = ob.checker(op, num);
        ans = (ret) ? "ODD" : "EVEN";
      } else if (ch == 2) {
        op = ob.isPrime();
        ret = ob.checker(op, num);
        ans = (ret) ? "PRIME" : "COMPOSITE";
      } else if (ch == 3) {
        op = ob.isPalindrome();
        ret = ob.checker(op, num);
        ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

      }
      System.out.println(ans);
    }
  }
}
