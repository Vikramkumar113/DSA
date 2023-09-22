import java.util.ArrayList;
import java.util.List;

public class subSetSum2 {
  public static void main(String[] args) {
     int arr[] = {1,2,2};
     List<List<Integer>> ans = new ArrayList<>();
     subsetSum(0, arr, ans, new ArrayList<>());
     System.out.println(ans);
  }

  public static void subsetSum(int i, int arr[], List<List<Integer>> ans, List<Integer> ds)
  {
      ans.add(new ArrayList<>(ds));
      for (int j = i; j < arr.length; j++) {
        if (j != i && arr[j] == arr[j - 1])
            continue;

        ds.add(arr[j]);
        subsetSum(j+1, arr, ans, ds);
        ds.remove(ds.size() - 1);
    }
  }
  
}
