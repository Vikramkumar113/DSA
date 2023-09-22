
public class MinimumSizeSubarraySum {
  public static void main(String[] args) {
     int arr[] = {2,3,1,2,4,3};
     System.out.println(minSubArray(arr, 7));
  }

  public static int minSubArray(int arr[], int target)
  {
     int s = 0;
     int e = 0;

     int minSum = 0;
     int minLength = Integer.MAX_VALUE;
     while(e < arr.length)
     {
        minSum = minSum + arr[e];
        e++;

        while(s < e && minSum >= target)
        {
           minSum = minSum - arr[s];
           s++;

            minLength = Math.min(minLength, e-s+1);
        }

       

     }

     if(minLength == Integer.MAX_VALUE)
     {
      return 0;
     }

     return minLength;
  }
}
