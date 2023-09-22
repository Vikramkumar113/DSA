// problem link - https://leetcode.com/problems/binary-subarrays-with-sum/description/
// video solution - https://youtu.be/Pkqq6kv2E6k


/* this is the another pattern of sliding window also very very important problem */



public class binarySubArrayWithSum {
  public static void main(String[] args) {
     int nums[] = {1,0,1,0,1};
     System.out.println(numSubarraysWithSum(nums, 2)- numSubarraysWithSum(nums, 1));
  }

  public static int numSubarraysWithSum(int[] nums, int goal) {
        int left =0;
        int right =0;
        int maxSubArray =0;
        int sum =0;

        while(right < nums.length)
        {
          sum = sum+nums[right];

          while(left <= right && sum > goal)
          {
               sum = sum-nums[left];
               left++;

          }
          
          maxSubArray = maxSubArray+ right-left+1;
          right++;
        }
        return maxSubArray;
  }
}
