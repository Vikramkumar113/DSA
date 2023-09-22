import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
  public static void main(String[] args) {
    // int arr[] = {1,2,3,4,5,6,7,8,9};
    // List<List<Integer>> ans = new ArrayList<>();
    // findCombination(0, 3, arr, 9, ans, new ArrayList<>());
    // System.out.println(ans);

    int k =3,n=9;
    List<List<Integer>> ans = new ArrayList<>();
    findCombination1(1, k, n, ans, new ArrayList<>());
    System.out.println(ans);

  }

  // Approach -1
  public static void findCombination(int i, int k, int arr[], int target, List<List<Integer>> ans, List<Integer> ds) {
    if (target == 0) {
      if (k == ds.size()) {
        ans.add(new ArrayList<>(ds));
      }
      return;
    }
    for (int j = i; j < arr.length; j++) {
      ds.add(arr[j]);
      findCombination(j + 1, k, arr, target - arr[j], ans, ds);
      ds.remove(ds.size() - 1);
    }
  }

  // Approach -2
  public static void findCombination1(int start, int k, int target, List<List<Integer>> ans, List<Integer> ds) {

    if (k == ds.size() && target == 0) {
      ans.add(new ArrayList<>(ds));
      return;
    }

    for (int j = start; j <= 9; j++) {

      if(j > target) break;
      ds.add(j);
      findCombination1(j + 1, k, target - j, ans, ds);
      ds.remove(ds.size() - 1);
    }
  }

}
