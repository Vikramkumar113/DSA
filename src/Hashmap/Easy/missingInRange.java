// https://www.geeksforgeeks.org/find-missing-elements-of-a-range/

import java.util.HashSet;

public class missingInRange {
  public static void main(String[] args) {
    int arr[] = {1, 14, 11, 51, 15};
    int low = 50, high = 55;


    findMissingElements(low, high, arr);
  }

  public static void findMissingElements(int low, int high, int arr[]){
      HashSet<Integer> hs = new HashSet<>();
      for(Integer element : arr){
        hs.add(element);
      }
      while(low<=high){
         if(!hs.contains(low) ){
            System.out.println(low);
         }
          low++;
      }
  }
}
