class findClosestPair {
  public static void main(String[] args) {
    int arr1[] = {1, 4, 5, 7};
    int arr2[] = {10, 20, 30, 40};
    int x = 32;
    findCloseset(arr1, arr2, x);
  }

  public static void findCloseset(int arr1[], int arr2[], int x){
      int leftEle = 0, rightEle =0;
      int i=0, j= arr2.length-1;
      int minDifference = Integer.MAX_VALUE;

      while(i< arr1.length && j >= 0)
      {
         if(Math.abs(arr1[i]+ arr2[j]-x )< minDifference)
         {
              leftEle = i;
              rightEle = j;
              minDifference = Math.abs(arr1[i]+ arr2[j]-x);
         }

         if((arr1[i]+arr2[j]) > x)
         {
             j--;
         }else{
             i++;
         }
      }

      System.out.println(arr1[leftEle]+" "+arr2[rightEle]);
  
  }
}