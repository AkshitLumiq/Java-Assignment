import java.util.Scanner;
import java.lang.Math;

class number {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);

    int n1 = sc.nextInt(), n2 = sc.nextInt(), n3 = sc.nextInt();
    System.out.println("sum: " + (n1 + n2 + n3));
    System.out.println("avg: " + (n1 + n2 + n3) / 3);
    System.out.println("product: " + (n1 * n2 * n3));
    System.out.println("smallest: " + Math.min(Math.min(n1, n2), n3));
    System.out.println("largest: " + Math.max(Math.max(n1, n2), n3));

    sc.close();
  }
}