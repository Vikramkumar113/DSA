import java.util.List;
import java.util.ArrayList;

public class combinationSum1 {
  public static void main(String[] args) {
      int arr[] = {2,3,6,7};
      int n =4;
      int target = 7;
      // ArrayList<Integer> list = new ArrayList<Integer>();
      // combinationSum(arr, 0, 4,  list, target, 0);


      System.out.println(combination(arr, target));
  }

  //tip = if there are question like print subsequences or print combinations from array and in the constraints n is smaller than there is recursion will be applied 
  // here we are using approach same as we didi in printSubsequences (pick and not pick approach)



  // Approach -1 
  public static void combinationSum(int arr[], int i,int n, ArrayList<Integer> list, int target, int sum){
      if(sum == target){
        for(Integer element : list){
          System.out.print(element+" ");
        } 
       System.out.println("");
       return;
        }
      

      if(sum > target || i == n){
         return;
      }

      list.add(arr[i]);
      sum +=arr[i];
      combinationSum(arr,i , n, list,  target, sum);
       list.remove(list.size()-1);
      sum -=arr[i];
      combinationSum(arr,i+1 , n, list,  target, sum);
  }

  //Approach -2 
   public static List<List<Integer>> combination(int []arr, int target)
   {
      List<List<Integer>> ans = new ArrayList<>();
      findCombination(0, arr, target, ans, new ArrayList<>());
      return ans;
   }

   public static void findCombination(int i, int arr[], int target, List<List<Integer>> ans, List<Integer> ds){
        if(i == arr.length){
          if(target == 0)
          {
             ans.add(new ArrayList<>(ds));
             
          }
          return;
        }

        if(arr[i] <= target)
        {
          ds.add(arr[i]);
          findCombination(i, arr, target-arr[i], ans, ds);
          ds.remove(ds.size()-1);
        }
        findCombination(i+1, arr, target, ans, ds);
   }
}
