import java.io.*;
import java.util.*;

class compareString implements Comparator<String> {
  @Override
  public int compare(String s1, String s2) {
    double a = Double.parseDouble(s1);
    double b = Double.parseDouble(s2);
    if (a < b)
      return 1;
    else if (a == b)
      return 0;
    else
      return -1;
  }
}

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    // System.out.println(t);

    ArrayList<String> strarr = new ArrayList<String>();
    for (int i = 0; i < t; i++)
      strarr.add(sc.nextLine());

    compareString cs = new compareString();

    Collections.sort(strarr, cs);

    for (String s : strarr)
      System.out.println(s);
  }
}
