public class countNumberOfNiceSubArrays {
  public static void main(String[] args) {
      int arr[] = {2,4,6};
      System.out.println(countNiceSubArrays(arr, 1)-countNiceSubArrays(arr, 0));
  }

  // solution-1
  public static int countNiceSubArrays(int nums[], int k)
  {
        int left =0;
        int right =0;
        int maxSubArray =0;
        int oddDigits = 0;

        while(right < nums.length)
        {
           if(nums[right]%2!=0)
           {
             oddDigits++;
           }

          while(left <= right && oddDigits > k)
          {
            if (nums[left] % 2 != 0) {
              oddDigits--;
            }
            left++;
          }
          
          maxSubArray = maxSubArray+ right-left+1;
          right++;
        }
        return maxSubArray;
  }

// solution -2 same approach as previous but line of code is reduces little bit optimized
  // public static int atMost(int[] A, int k) {
  //   int res = 0, i = 0, n = A.length;
  //   for (int j = 0; j < n; j++) {
  //       k -= A[j] % 2;
  //       while (k < 0)
  //           k += A[i++] % 2;
  //       res += j - i + 1;
  //   }
  //   return res;
  // }
}
