import java.util.ArrayList;

public class ipl2021 {
  public static void main(String[] args) {
    int arr[] = {1 ,2 ,3 ,1 ,4 ,5 ,2 ,3 ,6};

    System.out.println(maxOfSubArrays(arr, 9, 3));
    
  }

  public static ArrayList<Integer> maxOfSubArrays(int arr[], int n, int k)
  {
     ArrayList<Integer> list = new ArrayList<Integer>();
        int max = 0;
        for(int i=0; i< k; i++)
        {
            max = Math.max(max, arr[i]);
        }
        
        list.add(max);
        
        
        for(int i=k; i < n; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
                list.add(max);
            }else{
                list.add(max);
            }
        }
        
        return list;
  }
}
