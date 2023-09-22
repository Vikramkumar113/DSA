import java.util.HashMap;
import java.util.Scanner;


// read this article to better understand hashing = https://takeuforward.org/hashing/hashing-maps-time-complexity-collisions-division-rule-of-hashing-strivers-a2z-dsa-course/

public class hashing {
  public static void main(String[] args) {
    int arr[] = {1,2,1,3,4,12};
   // hashingUsingArray(arr);
    hashingUsingHashMap(arr);
  }

  public static void hashingUsingArray(int arr[])
  {
      int hash[] = new int[13];  // length of array should be max element +1 in arr
      for(int i=0; i< arr.length; i++)
      {
        hash[arr[i]]++;
      }

      Scanner sc = new Scanner(System.in);
      System.out.println("Numbers you want to check : ");
      int q = sc.nextInt();
      while( q>=0)
      { 
          int number = sc.nextInt();
          System.out.println(hash[number]);
      }
  }

  public static void hashingUsingHashMap(int arr[])
  {
      HashMap<Integer, Integer> mp = new HashMap<>();
      for (int num : arr) {
        int freq = mp.getOrDefault(num, 0) + 1;
        mp.put(num, freq);
    }

       // Iterate over the map:
        /*
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            System.out.println(it.getKey() + "->" + it.getValue());
        }
        */
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int number =  sc.nextInt();
            // fetch:
            System.out.println(mp.getOrDefault(number, 0));
        }




  }

}
