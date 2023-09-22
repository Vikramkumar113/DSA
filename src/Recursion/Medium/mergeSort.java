import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
  public static void main(String[] args) {
    int arr[] = {5,3,7,6,8,1,9,2,4};
    int n = 9;
     mergeSort(arr, 0,n-1);

     for(int i=0; i<= n-1;i++){
       System.out.print(arr[i]+" ");
     }
  }

  public static void mergeSort(int arr[], int low, int high)
  {
      if(low >= high) return;
        int mid = (low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        
        merge(arr, low, mid, high);


      
  }

  public static void merge(int arr[], int low, int mid, int high)
  {
        int left =low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();

        while(left <=mid && right<=high){
          if(arr[left] <= arr[right])
          {
             temp.add(arr[left]);
             left++;
          }else{
             temp.add(arr[right]);
             right++;
          }
        }

        while(left <=mid){
            temp.add(arr[left]);
            left++;
        }

        while(right <=high){
         temp.add(arr[right]);
          right++;
        }


        for(int i=low; i <=high; i++){
            arr[i] = temp.get(i-low);
        }

       
  }
}


/* time complexity - (megesort function) = as we are dividing whole array n/2 -> n/4 -> n/8  so as we know complexity is logn (log base 2)
                      (merge function) = in merge function at the worst case we iterate both half of the array(left and right) so 0(n)

    total tc = o(n*logn)
    
  space complexity = (mergesort function) = we are not using any extra space 
                     (merge function) = we are using extra space for temporary array for inserting n numbers so 0(n)
 */
