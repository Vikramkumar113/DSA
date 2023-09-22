import java.util.HashSet;

public class longestSubStringWithoutRepeating{
  public static void main(String[] args) {
     String s= "lmtlpckmnoqplr";
     System.out.println(longestSubString(s));
  }

  public static int longestSubString(String s)
  {
      HashSet<Character> hs = new HashSet<>();
      int maxLength = 0;
      int start = 0;
      int end = 0;

      if(s.length() == 0)
      {
        return 0;
      }

      while(end < s.length())
      {
        if(!hs.contains(s.charAt(end))){
          hs.add(s.charAt(end));
          end++;

          int currentLength = end - start;

          maxLength = Math.max(maxLength, currentLength);

        }else{
          hs.remove(s.charAt(start));
          start++;
        }
      }

      return maxLength;
  }




}