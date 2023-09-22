import java.util.ArrayList;

public class printAnySubsequenceWithSumk {
  public static void main(String[] args) {
    int arr[] = {1,2,1};
    int n = 3;

    ArrayList<Integer> list = new ArrayList<Integer>();
    printAnyOneWithK(0, arr, list, n, 3, 0);
  }

  public static boolean printAnyOneWithK(int i, int nums[], ArrayList<Integer> list , int n, int target, int sum){
    if(i==n){
      if(sum == target){
        for(Integer element : list){
         System.out.print(element+" ");
         }
          System.out.println("");
          return true;
        }
         return false;
    }

    list.add(nums[i]);
    sum +=nums[i];
    if(printAnyOneWithK(i+1, nums, list, n, target, sum) == true) return true;
     list.remove(list.size()-1);
    sum -=nums[i];
    if(printAnyOneWithK(i+1, nums, list, n, target, sum) == true) return true;

    return false;
  }
}
