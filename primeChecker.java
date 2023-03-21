import java.io.*;
import java.util.*;

class Prime {
  void checkPrime(ArrayList<Integer> arr) {
    for (int num : arr) {
      boolean flag = true;

      if (num <= 1)
        flag = false;

      for (int i = 2; i <= num / 2 && flag; i++) {
        if (num % i == 0 && num != i) {
          flag = false;
        }
      }

      if (flag)
        System.out.print(num + " ");
    }
    System.out.println();
  }
}

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Prime prime = new Prime();
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(sc.nextInt());
    prime.checkPrime(arr);
    arr.add(sc.nextInt());
    prime.checkPrime(arr);
    arr.add(sc.nextInt());
    prime.checkPrime(arr);
    arr.add(sc.nextInt());
    arr.add(sc.nextInt());
    prime.checkPrime(arr);
  }
}
