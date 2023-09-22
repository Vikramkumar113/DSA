import java.util.ArrayList;

class subArrayWithSum {
  public static void main(String[] args) {
  //   int n=5;
  //   int arr[] = {1,2,3,4,5};
  //   int s=12;

  //  System.out.println( subarraySum(arr,n,s));


  int arr[] = {-1,-1,-1};
  int k=0;
   System.out.println(subarraySum(arr, k));
  }

  public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int left =1;
        int right =1;
        int sum =0;
        
        while(right <= n)
        {
             sum = sum+arr[right];
             
             
            while(left <= right && sum >  s)
            {
                 sum=sum-arr[left];
                 left++;
            }
            
            
            if(sum ==s)
            {
                list.add(left);
                list.add(right);
                return list;
            }
            
            right = right+1;
        }
        
        list.add(-1);
        return list;
        
    }

    public static int subarraySum(int[] nums, int k) {
      int count = 0;
      int left = 0;
      int right = 0;
      int sum = 0;
      int n = nums.length;
    
      while (right < n) {
        sum += nums[right];
    
        while (left <= right && sum > k) {
          sum -= nums[left];
          left++;
        }
    
        if (sum == k) {
          count++;
        }
    
        right++;
      }
    
      return count;
    }
    

    
}