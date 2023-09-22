import java.util.LinkedHashMap;
import java.util.Map;

public class nonRepeatingCharacter {
  public static void main(String[] args) {
        System.out.println(nonRepeated("zxvczbtxyzvy"));
    
  }

  public static char nonRepeated(String s)
  {
     LinkedHashMap<Character, Integer> mpp = new LinkedHashMap<>(); 
     for(int i=0; i< s.length();i++)
     {
          if(mpp.containsKey(s.charAt(i)))
          {
              mpp.put(s.charAt(i), mpp.get(s.charAt(i))+1);
          }else{
             mpp.put(s.charAt(i), 1);
          }
     }

     for(Map.Entry<Character, Integer> entry : mpp.entrySet())
     {
          if(entry.getValue() == 1)
          {
             return entry.getKey();
          }
     }

     return '$';

  }
}
