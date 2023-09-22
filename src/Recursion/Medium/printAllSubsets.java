
import java.util.ArrayList;

public class printAllSubsets {
  public static void main(String[] args) {
    int arr[] = {2,3,6,7};
    int n = 4;
 
  ArrayList<Integer> list = new ArrayList<Integer>(); 
   allSubSets(0, arr, list, n);
    
  }

  public static  void allSubSets(int i, int nums[], ArrayList<Integer> list, int n){
        if(i == n){
           for(Integer element : list){
            System.out.print(element+" ");
           }
           if(list.size() == 0){
            System.out.print("{}"); 
            }

            System.out.println("");
           return;
      }

        

        list.add(nums[i]);
        allSubSets(i+1, nums, list, n);
        list.remove(list.size()-1);


        allSubSets(i+1, nums, list, n);

  }


}
