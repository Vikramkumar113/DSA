
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class combinationSum2 {
  public static void main(String[] args) {
      int arr[] = {10,1,2,7,6,1,5};
      int target = 8;
      Arrays.sort(arr);
      System.out.println(combination(arr, target));
  }


  // Naive approach -1 (dont submit on leetcode time limit exceed)
  // public static Set<List<Integer>> combination(int []arr, int target)
  //  {
  //     Set<List<Integer>> ans = new HashSet<>();
  //     findCombination(0, arr, target, ans, new ArrayList<>());


  //     return ans;
  //  }

  // public static void findCombination(int i, int arr[], int target, Set<List<Integer>> ans, List<Integer> ds){
  //      if(i == arr.length){
  //          if(target == 0)
  //          {
  //             ans.add(new ArrayList<>(ds));

  //          }
  //          return;
  //      }

  //      if(arr[i] <=target){
  //       ds.add(arr[i]);
  //       findCombination(i+1, arr, target-arr[i], ans, ds);
  //       ds.remove(ds.size()-1);
  //      }

  //      findCombination(i+1, arr, target, ans, ds);
  // }

  // Efficient approach 
  public static List<List<Integer>> combination(int []arr, int target)
   {
      List<List<Integer>> ans = new ArrayList<>();
      findCombination(0, arr, target, ans, new ArrayList<>());
      return ans;
   }

   public static void findCombination(int i, int arr[], int target, List<List<Integer>> ans, List<Integer> ds) {

      if (target == 0) {
          ans.add(new ArrayList<>(ds));
          return;
      }
  
      for (int j = i; j < arr.length; j++) {
          if (j > i && arr[j] == arr[j - 1])
              continue;
          if (arr[j] > target)
              break;
  
          ds.add(arr[j]);
          findCombination(j + 1, arr, target - arr[j], ans, ds);
          ds.remove(ds.size() - 1);
      }
  }
  

}
