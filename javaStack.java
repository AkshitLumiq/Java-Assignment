import java.util.*;

class Solution {

  public static void main(String[] argh) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNext()) {
      String input = sc.next();
      boolean flag = true;
      Stack<Character> S = new Stack<Character>();
      for (int i = 0; i < input.length(); i++) {
        Character c = input.charAt(i);
        if (c == '(' || c == ')' || c == '{' || c == '}' || c == '[' || c == ']') {
          if (c == '[' || c == '(' || c == '{')
            S.push(c);
          else if (!S.isEmpty()
              && ((S.peek() == '[' && c == ']') || (S.peek() == '{' && c == '}') || (S.peek() == '(' && c == ')')))
            S.pop();
          else {
            flag = false;
            break;
          }
        }
        // System.out.println(c + " " + S);
      }
      if (flag && S.isEmpty())
        System.out.println("true");
      else
        System.out.println("false");
    }

    sc.close();
  }
}
