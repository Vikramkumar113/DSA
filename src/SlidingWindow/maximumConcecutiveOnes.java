public class maximumConcecutiveOnes {
  public static void main(String[] args) {
    int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
    int k =3;
    System.out.println(maxOnes(arr, k));
  }

  public static int maxOnes(int arr[], int k)
  {
    int start =0;
    int end = 0;
    int intialK = 0;
    int maxLength =0;

    while(end < arr.length)
    {
        if(arr[end] == 0)
        {
          intialK++;
        }

        while(intialK > k)
        {
           if(arr[start] == 0)
           {
             intialK--;
           }
           start++;
        }

        int currentLength = end - start+1;
        maxLength = Math.max(currentLength, maxLength);
        end++;
    }

    return maxLength;
  }

}
