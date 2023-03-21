import java.util.*;

public class Solution {
  public static boolean func(int game[], int leap, int index, boolean visited[]) {
    if (index >= game.length) {
      return true;
    }
    if (index < 0 || game[index] == 1 || visited[index])
      return false;

    visited[index] = true;
    return func(game, leap, index + 1, visited)
        || func(game, leap, index + leap, visited)
        || func(game, leap, index - 1, visited);
  }

  public static boolean canWin(int leap, int[] game) {
    return func(game, leap, 0, new boolean[game.length]);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int q = scan.nextInt();
    while (q-- > 0) {
      int n = scan.nextInt();
      int leap = scan.nextInt();

      int[] game = new int[n];
      for (int i = 0; i < n; i++) {
        game[i] = scan.nextInt();
      }

      System.out.println((canWin(leap, game)) ? "YES" : "NO");
    }
    scan.close();
  }
}
