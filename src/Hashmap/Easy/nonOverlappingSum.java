// gfg : https://www.geeksforgeeks.org/overlapping-sum-two-array/

import java.util.HashMap;
import java.util.Map;

class nonOverlappingSum {
  public static void main(String[] args) {
    int arr1[] = {1,5,3,8};
    int arr2[] = {5,4,6,7};

    System.out.println(findSum(arr1, arr2));
  }

  public static int findSum(int arr1[], int arr2[])
  {
      int sum =0;
      HashMap<Integer, Integer> hs = new HashMap<>();
      for(int num : arr1)
      {
         hs.put(num, hs.getOrDefault(num,0)+1);
      }

      for(int num : arr2)
      {
         hs.put(num, hs.getOrDefault(num,0)+1);
      }

      for(Map.Entry<Integer,Integer> entry : hs.entrySet()){
          if(entry.getValue() == 1){
              sum = sum+ entry.getKey();
          }        
      }

      return sum;
  }

  
}