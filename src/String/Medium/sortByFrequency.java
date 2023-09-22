import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class sortByFrequency {
  public static void main(String[] args) {
     
            int arr[] = {5,5,4,6,4};
            int N = 5;
            List<Integer> result = SBF(arr, N);
            result.forEach(elem -> {
                System.out.print(elem + " ");
            });

  }

  public static List<Integer> SBF(int arr[], int N)
	{
	    List<Integer> li = new ArrayList<>();
	    LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
	    
	    for(int i=0; i < N; i++)
	    {
	        lhm.put(arr[i], lhm.getOrDefault(arr[i],0)+1);
	    }
	    
	    lhm.entrySet().stream()
	   .sorted((e1, e2) -> {
            int cmp = e2.getValue().compareTo(e1.getValue()); // Sort by frequency in descending order
            return cmp != 0 ? cmp : e1.getKey().compareTo(e2.getKey()); // If frequency is same, sort by keys in ascending order
        })
	    .forEach(record -> {
	        int key = record.getKey();
	        int value = record.getValue();
	        
	        for(int i=0; i < value;i++)
	        {
	           li.add(key);
	        }
	    });
	    
	    return li;
	    
	    
	}

}
