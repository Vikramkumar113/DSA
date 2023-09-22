// gfg link = https://www.geeksforgeeks.org/maximum-distance-two-occurrences-element-array/

import java.util.HashMap;

public class maxDistance {
  public static void main(String[] args) {
      int arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
      System.out.println(maxDistanceBetweenSameElement(arr));
  }

  public static int maxDistanceBetweenSameElement(int arr[])
  {
         HashMap<Integer, Integer> map = new HashMap<>();
         int max_occ = 0;
         for(int i=0; i< arr.length;i++)
         {
             if(!map.containsKey(arr[i]))
             {
                map.put(arr[i],i);
             }else{
              max_occ = Math.max(max_occ, i- map.get(arr[i]));
             }
         }

         return max_occ;


  }

}
