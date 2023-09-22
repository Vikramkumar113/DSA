import java.util.ArrayList;

public class printAllSubsetsWithk {
  public static void main(String[] args) {
    int arr[] = {1,2,1};
    int n = 3;

    ArrayList<Integer> list = new ArrayList<Integer>(); 
   // allSubSets(0, arr, list, n, 3);
   allSubSets(0, arr, list, n, 2, 0);
  }

  // Approach-1
  // public static  void allSubSets(int i, int nums[], ArrayList<Integer> list, int n, int target){
  //       if(i == n){
  //          int sum =0;
  //          for(Integer element : list){
  //           sum = sum+ element;
  //          }

  //          if(sum == target){
  //           for(Integer element : list){
  //           System.out.print(element+" ");
  //          }
  //          }
  //           System.out.println("");
  //          return;
  //     }

        

  //       list.add(nums[i]);
  //       allSubSets(i+1, nums, list, n, target);
  //       list.remove(list.size()-1);
  //       allSubSets(i+1, nums, list, n, target);

  // }


  // Approach-2 
  public static void allSubSets(int i, int nums[], ArrayList<Integer> list , int n, int target, int sum)
  {
      if(i==n){
        if(sum == target){
          for(Integer element : list){
           System.out.print(element+" ");
           }
          }
        System.out.println("");
        return;
      }

      list.add(nums[i]);
      sum +=nums[i];
      allSubSets(i+1, nums, list, n, target, sum);
       list.remove(list.size()-1);
      sum -=nums[i];
      allSubSets(i+1, nums, list, n, target, sum);
  }
}
