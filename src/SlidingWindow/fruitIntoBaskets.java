import java.util.HashMap;

public class fruitIntoBaskets {
  public static void main(String[] args) {
    int arr[] = {0,1,2,2};
 
    System.out.println(totalFruit(arr));
  }

  public static int totalFruit(int arr[])
  {
      int start = 0;
      int end = 0;
      int maxLength =0;
      HashMap<Integer, Integer> hm = new HashMap<>();

      while(end < arr.length)
      {
         hm.put(arr[end], hm.getOrDefault(arr[end], 0)+1);   // here we are just add arr values in hashmap with their frequencies
         while(hm.size() > 2)
         {
           /*  what we are doing in the next line as our hashmap size is greater than 2 so we are trying to decrement our
           window size so we checking frequences of start element like start element can occur many time so every time we will decrment
           start element frequences and when the frequenceis become 0 we will remove the start element from hashmap
           ex- [3,3,3,1,2,1,1,2,3,3,4] you can understand through this example */ 
            hm.put(arr[start], hm.get(arr[start] - 1));  
            if(hm.get(arr[start]) == 0)
            {
              hm.remove(arr[start]);
            }
            start++;
         }


         int currentLength = end -start+1;
         maxLength = Math.max(currentLength, maxLength);
      
      }

      return maxLength;



  }
}
