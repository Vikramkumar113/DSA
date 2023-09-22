
import java.util.LinkedHashMap;
import java.util.Map;

public class firstRepeatingElement {
  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4};
    System.out.println(firstRepeated(arr));
   //firstRepeated(arr);
  }

  public static int firstRepeated(int arr[])
  {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int ans = -1;
        for(int i=0; i< arr.length;i++)
        {
           if(map.containsKey(arr[i]))
           {
              map.put(arr[i], map.get(arr[i])+1);
           }else{
              map.put(arr[i],1);
           }
        }

        for(Map.Entry<Integer, Integer> element : map.entrySet())
        {
          if(element.getValue() > 1)
          {
            ans = element.getKey();
            break;
          }
        }

        for(int i=0; i< arr.length;i++)
        {
           if(arr[i] == ans)
           {
             return i+1;
           }
        }

        return ans;




       


  }
}
