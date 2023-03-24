import java.util.HashMap;

class maxmDistinctNumberInSubarraySizeK {
  static int[] maxDistinctNumbInSubarrOfSizeK(int arr[], int k) {
    int res[] = new int[arr.length - k + 1];
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

    int prev = 0, idx = 0;

    for (int i : arr) {
      hmap.put(i, idx);

      if (idx - prev + 1 == k) {
        res[idx - k + 1] = hmap.size();
        if (hmap.containsKey(arr[prev]) && hmap.get(arr[prev]) <= idx - k + 1)
          hmap.remove(arr[prev]);

        prev++;
      }
      idx++;
    }

    return res;
  }

  public static void main(String args[]) {
    int k = 4;
    int arr[] = { 1, 2, 1, 3, 4, 2, 3 };
    int res[] = maxDistinctNumbInSubarrOfSizeK(arr, k);
    for (int i : res)
      System.out.println(i);
  }
}