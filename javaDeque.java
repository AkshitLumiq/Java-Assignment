import java.util.*;

public class test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    int n = in.nextInt();
    int m = in.nextInt();

    int res = Integer.MIN_VALUE;
    HashMap<Integer, Integer> hmap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int num = in.nextInt();

      deque.addFirst(num);
      hmap.put(num, i);
      if (deque.size() == m) {
        if (res < hmap.size())
          res = hmap.size();

        int lastElement = deque.removeLast();
        if (hmap.get(lastElement) == i - m + 1)
          hmap.remove(lastElement);
      }
    }

    System.out.println(res);
  }
}
