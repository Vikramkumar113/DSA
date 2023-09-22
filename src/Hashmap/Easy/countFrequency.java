import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countFrequency {
  public static void main(String[] args) {
     int nums[] = {1,3,1,9,2,7};
     countFrequency(6,9,nums);
  }

  public static void countFrequency(int n, int x, int []nums){
   Map<Integer, Integer> mpp = new HashMap<>(); 
    
    for(int i=0; i< n; i++)
    {
       if(mpp.containsKey(nums[i]))
       {
            mpp.put(nums[i], mpp.get(nums[i])+1);
       }else{
            mpp.put(nums[i],1);
       }
    }

    for(Map.Entry<Integer, Integer> element : mpp.entrySet())
    {
        System.out.println(element.getKey()+"->"+element.getValue());
    }


   
}
  
}
