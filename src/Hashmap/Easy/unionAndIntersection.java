import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class unionAndIntersection {
  public static void main(String[] args) {
       int arr1[] = {10,15,4,20};
       int arr2[] = {8,4,2,10};

       unionIntersection(arr1,arr2);
  }

  public static void unionIntersection(int arr1[], int arr2[])
  {
     HashMap<Integer, Integer> map = new HashMap<>();
     for(int i=0; i< arr1.length;i++)
     {
      if(map.containsKey(arr1[i]))
      {
           map.put(arr1[i], map.get(arr1[i])+1);
      }else{
           map.put(arr1[i],1);
      }
     }

     for(int i=0;i< arr2.length;i++)
     {
       if(map.containsKey(arr2[i]))
      {
           map.put(arr2[i], map.get(arr2[i])+1);
      }else{
           map.put(arr2[i],1);
      }
     }


     //Union
     ArrayList<Integer> list1= new ArrayList<>();
     ArrayList<Integer> list2 = new ArrayList<>();

     for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
            list1.add(entry.getKey());


      //Intersection
      for(Map.Entry<Integer, Integer> entry : map.entrySet())
            if(entry.getValue() > 1){
                list2.add(entry.getKey());
            }
     


      System.out.println("Union : "+list1);
      System.out.println("Intersection : "+list2);

  }
}
