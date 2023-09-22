import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class subsetSum1 {
  public static void main(String[] args) {
    int arr[] = {5,2,1};
    ArrayList<Integer> list = new ArrayList<>();
    int n=3;
    subSetSum(0, arr, 0, list, n);
    Collections.sort(list);
    System.out.println(list);
  }

  public static void subSetSum(int i, int nums[], int sum, ArrayList<Integer> list,  int n){
       if(i==n)
       {
           list.add(sum);
          return;
       }

       sum= sum+nums[i];
       subSetSum(i+1, nums, sum, list, n);
       sum = sum-nums[i];
       subSetSum(i+1, nums, sum,list,  n);

  }
  
}
