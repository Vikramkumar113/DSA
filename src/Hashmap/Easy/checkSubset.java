// QUESTION link = https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/

import java.util.HashSet;

public class checkSubset {
  public static void main(String[] args) {
    int arr1[] = {1, 2, 3, 4, 5, 6};
    int arr2[] = {1, 2, 4};

    System.out.println(checkWhetherSubsetOrNot(arr1,arr2));
  }

  public static boolean checkWhetherSubsetOrNot(int arr1[], int arr2[]){
     HashSet<Integer> mp = new HashSet<>();    
     for(int i=0; i< arr1.length;i++)
     {
       mp.add(arr1[i]);
     }

     for(int i=0; i< arr2.length;i++)
     {
       if(!mp.contains(arr2[i]))
       {
          return false;
       }
     }

     return true;
  }
}
