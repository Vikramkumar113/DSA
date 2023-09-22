public class quickSort {
  public static void main(String[] args) {
    int arr[] = {5,3,7,6,8,1,9,2,4};
    int n = 9;
    quickSortAlgorithm(arr, 0, n-1);
    for(int i=0; i<= n-1; i++){
      System.out.print(arr[i]+" ");
    }

  }

  public static int partition(int arr[], int low, int high){
       int pivot = arr[low];
       int i = low;
       int j = high;

       while(i < j){
          while(arr[i] <= pivot && i<=high){
            i++;
          }

          while(arr[j] > pivot && j >= low){
            j--;
          }

          if( i < j)
          {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          }
       }

       int temp = arr[low];
       arr[low] = arr[j];
       arr[j] = temp;

       return j;
  }
  public static void quickSortAlgorithm(int arr[], int low, int high){
    if(low < high){
        int p = partition(arr, low, high);
        quickSortAlgorithm(arr, low, p-1);
        quickSortAlgorithm(arr, p+1, high);
    }
  }
}


// tc = ologn
// sc = o(1)