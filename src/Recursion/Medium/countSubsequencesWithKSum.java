
public class countSubsequencesWithKSum{
  public static void main(String[] args) {
    int arr[] = {1,2,3,4};
    int n = 4;
    System.out.println(countSubsequences(0, arr, n, 5, 0));
  }

  public static int countSubsequences(int i, int nums[], int n, int target, int sum){
    if(i==n){
      if(sum == target){
        return 1; 
      }
      return 0;  
    }

   
    sum +=nums[i];
    int l = countSubsequences(i+1, nums, n, target, sum);
    sum -=nums[i];
    int r = countSubsequences(i+1, nums, n, target, sum);

    return l+r;
  }
}